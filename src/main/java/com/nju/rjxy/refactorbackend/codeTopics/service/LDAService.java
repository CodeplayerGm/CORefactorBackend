package com.nju.rjxy.refactorbackend.codeTopics.service;

import com.nju.rjxy.refactorbackend.codeTopics.lda.Estimator;
import com.nju.rjxy.refactorbackend.codeTopics.lda.LDAOption;
import com.nju.rjxy.refactorbackend.codeTopics.lda.Model;
import com.nju.rjxy.refactorbackend.codeTopics.preprocess.Corpus;
import com.nju.rjxy.refactorbackend.codeTopics.preprocess.Document;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.nju.rjxy.refactorbackend.codeTopics.preprocess.CommonStopWordList.myStopWords;
import static com.nju.rjxy.refactorbackend.codeTopics.preprocess.PreProcessMethods.*;
import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;
import static com.nju.rjxy.refactorbackend.common.Utils.javaAndDirectoryFilter;

@Service
public class LDAService {

    public void nlpPreprocess(String[] srvPaths) {
        Corpus corpus = preByService(srvPaths);
        // content1存储所有文件的words列表通过空格拼接而成的字符串
        StringBuilder content1 = new StringBuilder();
        content1.append(corpus.documents.size()).append("\n");
        for (Document doc : corpus.documents) {
            String line = String.join(" ", doc.words);
            line += "\n\n";
            content1.append(line);
        }

        // content2存储所有文件的绝对路径名
        StringBuilder content2 = new StringBuilder();
        for (String filename : corpus.fileNames) {
            content2.append(filename).append("\n");
        }

        try {
            File file = new File(wordsDir);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
                if (!file.exists()) {
                    file.createNewFile();
                }
            }

            FileWriter fileWriter = new FileWriter(file.getAbsolutePath(), false);
            fileWriter.write(content1.toString());
            fileWriter.close();

            File file2 = new File(filenameDir);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
                if (!file2.exists()) {
                    file2.createNewFile();
                }
            }

            FileWriter fileWriter2 = new FileWriter(file2.getAbsolutePath(), false);
            fileWriter2.write(content2.toString());
            fileWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Corpus preByService(String[] srvPaths) {
        //总的词袋
        Corpus allCorpus = new Corpus();
        allCorpus.init(new ArrayList<>(), new ArrayList<>());
        // 扫描目标路径下的所有代码文件（文件树的DFS遍历）
        for(String mpath : srvPaths){
            Corpus corpus = new Corpus();
            //将target_projects目录下的案例项目文件夹用自定义过滤器过滤出来，所有符合要求的文件绝对路径名
            corpus.init(mpath, javaAndDirectoryFilter);

            splitIdentifier(corpus);
            toLowerCase(corpus);
            removeStopWords(corpus, myStopWords);
            filtering(corpus);
            tf_idf(corpus);
            stemming(corpus);

            allCorpus.fileNames.addAll(corpus.fileNames);
            allCorpus.documents.addAll(corpus.documents);
        }
        Map<String, Integer> wordfrequency = new HashMap<>();
        for (Document document : allCorpus.documents) {
            for (String w : document.words) {
                if (!wordfrequency.containsKey(w)) {
                    wordfrequency.put(w, 0);
                }
                wordfrequency.put(w, wordfrequency.get(w) + 1);
            }
        }
        return allCorpus;
    }

    public void ldaProcess(int k, double alpha, double beta, int iter) throws IOException {
        LDAOption option = new LDAOption();

        option.est = true;
        option.inf = false;

        option.alpha = 1.0 / k; // 控制语料库主题的密度，一般设置成主题数的倒数1/K
        option.beta = beta; // 尽量设小一些，0.01等
        option.K = k; // 经验来确定的值  设置不同k值比较主题模型效果好坏来确定好的k值。见Model.perplexity()方法
        option.niters = iter; // 迭代次数一般1000-2000  从一开始到最终收敛过程中的迭代次数，值越大正确性越高，运行时间越长

        // 训练结果输出文档存储的目录
        option.dir = rootPath;
        option.dfile = "words.dat"; // 上一步分词、清洗后的所有文件的词库作为LDA输入
        option.savestep = 100;
        option.twords = 50; // 输出的tword中用前50个概率大的词代表主题的内容

        Estimator estimator = new Estimator();
        estimator.init(option);
        estimator.estimate();

        // 当前模型的困惑值写入文件，供接口查询
        File perplexityFile = new File(perplexityDir);
        if (!perplexityFile.exists()) {
            perplexityFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(perplexityFile.getAbsolutePath(), false);
        Model model = estimator.trnModel;
        fileWriter.write(model.perplexity() + "");
        fileWriter.close();
    }
}

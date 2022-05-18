package com.nju.rjxy.refactorbackend.controller;

import com.nju.rjxy.refactorbackend.codeTopics.service.FunctionalTopicService;
import com.nju.rjxy.refactorbackend.codeTopics.service.LDAService;
import com.nju.rjxy.refactorbackend.common.CommonResult;
import com.nju.rjxy.refactorbackend.depends.service.DependencyExtractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFile;

@RestController
@RequestMapping("/concern")
public class ConcernIdentifyController {

    @Autowired
    private LDAService ldaService;

    @Autowired
    private FunctionalTopicService functionalTopicService;

    @ResponseBody
    @PostMapping("/nlpPreprocess")
    public CommonResult nlpPreprocess(@RequestBody Map<String, Object> srvParam) {
        Object srvStr = srvParam.get("servicePathsString");
        CommonResult response = new CommonResult();
        Optional.of(srvStr).ifPresentOrElse(sps -> {
            String[] srvPaths = sps.toString().split("\n");
            Arrays.stream(srvPaths).forEach(System.out::println);

            try {
                ldaService.nlpPreprocess(srvPaths);
                response.setCode(200);
                response.setMsg("正在执行代码语义预处理。");
            } catch (Exception e) {
                response.setCode(500);
                response.setMsg("服务器异常！");
            }

        }, () -> {
            response.setCode(401);
            response.setMsg("参数错误！");
        });

        return response;
    }

    @ResponseBody
    @PostMapping("/ldaProcess")
    public CommonResult ldaProcess(@RequestBody Map<String, Object> ldaParam) {
        CommonResult response = new CommonResult();
        if (!checkNLPProcess()) {
            response.setCode(404);
            response.setMsg("缺失数据，请先完成代码语义预处理！");
            return response;
        }

        Optional.of(ldaParam).ifPresentOrElse(param -> {
            try {
                int k = Integer.parseInt(param.get("k").toString());
                double alpha = Double.parseDouble(param.get("alpha").toString());
                double beta = Double.parseDouble(param.get("beta").toString());
                int iter = Integer.parseInt(param.get("iter").toString());
                ldaService.ldaProcess(k, alpha, beta, iter);
                response.setCode(200);
                response.setMsg("正在执行LDA聚类。");
            } catch (Exception e) {
                response.setCode(500);
                response.setMsg("服务器异常！");
            }
        }, () -> {
            response.setCode(401);
            response.setMsg("参数错误！");
        });
        return response;
    }

    @ResponseBody
    @GetMapping ("/getPerplexity")
    public CommonResult getPerplexity() {
        CommonResult response = new CommonResult();
        if (!checkModelPerplexity()) {
            response.setCode(404);
            response.setMsg("缺失数据，请先完成主题建模！");
            return response;
        }

        try {
            String dataStr = readFile(perplexityDir);
            response.setCode(200);
            response.setMsg("获取模型perplexity成功：");
            response.setObj(Double.parseDouble(dataStr));
        } catch (Exception e) {
            response.setCode(500);
            response.setMsg("服务器异常！");
        }

        return response;
    }

    @ResponseBody
    @PostMapping("/concernSelect")
    public CommonResult concernSelect(@RequestBody Map<String, Object> concernParam) {
        CommonResult response = new CommonResult();
        if (!checkModelPerplexity() || !checkRelationDependency()) {
            response.setCode(404);
            response.setMsg("缺失数据，请先完成主题建模和relation依赖抽取！");
            return response;
        }

        Optional.of(concernParam).ifPresentOrElse(param -> {
            try {
                double tc1 = Double.parseDouble(param.get("tc1").toString());
                double tc2 = Double.parseDouble(param.get("tc2").toString());
                double file = Double.parseDouble(param.get("file").toString());
                double service = Double.parseDouble(param.get("service").toString());
                String[] srvPaths = param.get("srvPaths").toString().split("\n");
                functionalTopicService.functionalTopicSelect(tc1, tc2, service, file, srvPaths);
                response.setCode(200);
                response.setMsg("正在执行功能性主题筛选。");
            } catch (Exception e) {
                e.printStackTrace();
                response.setCode(500);
                response.setMsg("服务器异常！");
            }
        }, () -> {
            response.setCode(401);
            response.setMsg("参数错误！");
        });
        return response;
    }
}

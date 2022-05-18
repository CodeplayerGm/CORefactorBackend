package com.nju.rjxy.refactorbackend.controller;

import com.nju.rjxy.refactorbackend.common.CommonResult;
import com.nju.rjxy.refactorbackend.depends.service.DependencyExtractorService;
import com.nju.rjxy.refactorbackend.facluster.KMedoideClusterService;
import com.nju.rjxy.refactorbackend.nsga.NSGAService;
import com.nju.rjxy.refactorbackend.nsga.runbody.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;

@RestController
@RequestMapping("/")
public class SearchController {

    @Autowired
    private NSGAService nsgaService;

    @ResponseBody
    @PostMapping("/geneticSearch")
    public CommonResult geneticSearch(@RequestBody Map<String, Object> searchParam) {
        CommonResult response = new CommonResult();

        if (!checkConcernFile() || !checkCallMatrix() || !checkClusterFile()) {
            response.setCode(404);
            response.setMsg("缺失数据，请先完成功能性主题筛选、callMatrix依赖抽取、功能原子聚类！");
            return response;
        }

        Optional.of(searchParam).ifPresentOrElse(param -> {
            try {
                String searchType = param.get("searchType").toString();
                String searchGranularity = param.get("searchGranularity").toString();
                int generation = Integer.parseInt(param.get("generation").toString());
                int population = Integer.parseInt(param.get("population").toString());
                int maxRecord = Integer.parseInt(param.get("maxRecord").toString());
                float overloadRemainThreshold = Float.parseFloat(param.get("overloadRemainThreshold").toString());
                float crossoverProb = Float.parseFloat(param.get("crossoverProb").toString());
                float mutationProb = Float.parseFloat(param.get("mutationProb").toString());
                float breakProb = Float.parseFloat(param.get("breakProb").toString());
                double modelService = Double.parseDouble(param.get("modelService").toString());
                double modelFile = Double.parseDouble(param.get("modelFile").toString());
                int overloadThreshold = Integer.parseInt(param.get("overloadThreshold").toString());

                nsgaService.initParamConfig(generation, population, maxRecord, overloadRemainThreshold, crossoverProb,
                        mutationProb, breakProb, modelService, modelFile, overloadThreshold);
                Configuration configuration = new Configuration();
                // nsga 功能原子
                if (searchType.equals(NSGASearchType) && searchGranularity.equals(faGranularity)) {
                    nsgaService.faRefactorTest(configuration, 1);
                }
                // nsga 代码文件
                if (searchType.equals(NSGASearchType) && searchGranularity.equals(fileGranularity)) {
                    nsgaService.fileRefactorTest(configuration, 1);
                }
                // rs 功能原子
                if (searchType.equals(randomSearchType) && searchGranularity.equals(faGranularity)) {
                    nsgaService.faRandomSearchTest(configuration, 1);
                }
                // rs 代码文件
                if (searchType.equals(randomSearchType) && searchGranularity.equals(fileGranularity)) {
                    nsgaService.fileRandomSearchTest(configuration, 1);
                }

                response.setCode(200);
                response.setMsg("重构搜索完成。");
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

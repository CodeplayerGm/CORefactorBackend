package com.nju.rjxy.refactorbackend.controller;

import com.nju.rjxy.refactorbackend.common.CommonResult;
import com.nju.rjxy.refactorbackend.depends.service.DependencyExtractorService;
import com.nju.rjxy.refactorbackend.facluster.KMedoideClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;

@RestController
@RequestMapping("/")
public class FAClusterController {

    @Autowired
    private DependencyExtractorService dependencyExtractorService;
    @Autowired
    private KMedoideClusterService kMedoideClusterService;

    @ResponseBody
    @PostMapping("/faCluster")
    public CommonResult faCluster(@RequestBody Map<String, Object> clusterParam) {
        CommonResult response = new CommonResult();
        Optional.of(clusterParam).ifPresentOrElse(param -> {
            try {
                if (!checkDependencyJSON()) {
                    String systemRootPath = param.get("systemRootPath").toString();
                    dependencyExtractorService.mineParser("java", systemRootPath, "dependency", rootPath);
                }
                String overloadSrvPath = param.get("overloadSrvPath").toString();
                int k = Integer.parseInt(param.get("k").toString());
                kMedoideClusterService.FAClustering(overloadSrvPath, dependencyDir, clusterDir, k);
                response.setCode(200);
                response.setMsg("功能原子聚类完成。");
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

package com.nju.rjxy.refactorbackend.controller;

import com.nju.rjxy.refactorbackend.common.CommonResult;
import com.nju.rjxy.refactorbackend.depends.service.DependencyExtractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;

@RestController
@RequestMapping("/depend")
public class DependController {

    @Autowired
    private DependencyExtractorService dependencyExtractorService;

    @ResponseBody
    @PostMapping("/extractRelation")
    public CommonResult extractRelation(@RequestBody Map<String, Object> relationParam) {
        CommonResult response = new CommonResult();
        Optional.of(relationParam).ifPresentOrElse(param -> {
            try {
                if (!checkDependencyJSON()) {
                    String systemRootPath = param.get("systemRootPath").toString();
                    dependencyExtractorService.mineParser("java", systemRootPath, "dependency", rootPath);
                }
                dependencyExtractorService.getRelationJson(dependencyDir, relationDir, filenameDir);
                response.setCode(200);
                response.setMsg("relation依赖抽取完成。");
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

    @ResponseBody
    @PostMapping("/extractCallMatrix")
    public CommonResult extractCallMatrix(@RequestBody Map<String, Object> param) {
        CommonResult response = new CommonResult();
        Optional.of(param).ifPresentOrElse(p -> {
            try {
                String overloadSrvPath = p.get("overloadSrvPath").toString();
                if (!checkDependencyJSON()) {
                    String systemRootPath = param.get("systemRootPath").toString();
                    dependencyExtractorService.mineParser("java", systemRootPath, "dependency", rootPath);
                }
                dependencyExtractorService.getServiceCallGraph(overloadSrvPath, dependencyDir, overloadServiceFilenameDir, overloadServiceCallMatrixDir);
                response.setCode(200);
                response.setMsg("callMatrix依赖抽取完成。");
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

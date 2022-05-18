package com.nju.rjxy.refactorbackend.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nju.rjxy.refactorbackend.common.CommonResult;
import com.nju.rjxy.refactorbackend.nsga.PostProcessShowData.LeafFile;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFile;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFileList;
import static com.nju.rjxy.refactorbackend.nsga.Common.getFourBitsDoubleString;
import static com.nju.rjxy.refactorbackend.nsga.PostProcessShowData.*;

@RestController
@RequestMapping("/")
public class ChartsController {

    @ResponseBody
    @GetMapping("/getPrograms/{searchType}/{searchGranularity}")
    public CommonResult getPrograms(@PathVariable String searchType, @PathVariable String searchGranularity) {
        CommonResult response = new CommonResult();

        if (!checkPrograms()) {
            response.setCode(404);
            response.setMsg("缺失数据，请先完成重构搜索！");
            return response;
        }

        try {
            // nsga 功能原子
            if (searchType.equals(NSGASearchType) && searchGranularity.equals(faGranularity)) {
                String jsonString = readFile(outputFAProgramJson + jsonPostfix);
                JSONArray programs = JSONArray.parseArray(jsonString);
                List<String> objectives = readFileList(outputFAObjectiveTxt + txtPostfix);

                List<FAProgram> programList = new ArrayList<>(objectives.size() - 1);
                for (int i = 1; i < programs.size(); i++) {
                    // 解析方案json
                    FAProgram program = parseFAProgram(programs.getJSONObject(i));
                    // 补充优化目标信息
                    setFAObjectives(program, objectives.get(i));
                    programList.add(program);
                }
                response.setMsg("FA");
                response.setList(programList);
            }
            // nsga 代码文件
            if (searchType.equals(NSGASearchType) && searchGranularity.equals(fileGranularity)) {
            }
            // rs 功能原子
            if (searchType.equals(randomSearchType) && searchGranularity.equals(faGranularity)) {
                String jsonString = readFile(outputFARandomProgramJson + jsonPostfix);
                JSONArray programs = JSONArray.parseArray(jsonString);
                List<String> objectives = readFileList(outputFARandomObjectiveTxt + txtPostfix);

                List<FAProgram> programList = new ArrayList<>(objectives.size() - 1);
                for (int i = 1; i < programs.size(); i++) {
                    // 解析方案json
                    FAProgram program = parseFAProgram(programs.getJSONObject(i));
                    // 补充优化目标信息
                    setFAObjectives(program, objectives.get(i));
                    programList.add(program);
                }
                response.setMsg("FA");
                response.setList(programList);
            }
            // rs 代码文件
            if (searchType.equals(randomSearchType) && searchGranularity.equals(fileGranularity)) {
            }
            response.setCode(200);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(500);
            response.setMsg("服务器异常！");
        }
        return response;
    }

    private FAProgram parseFAProgram(JSONObject program) {
        JSONArray srvObjs = program.getJSONArray("children");
        List<FAService> srvList = new ArrayList<>();
        for (int j = 0; j < srvObjs.size(); j++) {
            JSONObject srvObj = srvObjs.getJSONObject(j);
            JSONArray faObjs = srvObj.getJSONArray("children");
            List<FA> faList = new ArrayList<>();
            for (int k = 0; k < faObjs.size(); k++) {
                JSONObject faObj = faObjs.getJSONObject(k);
                List<LeafFile> fileList = new ArrayList<>();
                JSONArray fileObjs = faObj.getJSONArray("children");
                for (int i = 0; i < fileObjs.size(); i++) {
                    fileList.add(new LeafFile(fileObjs.getJSONObject(i).getString("name")));
                }
                FA fa = new FA(faObj.getString("name"), fileList);
                faList.add(fa);
            }
            srvList.add(new FAService(srvObj.getString("name"), faList));
        }
        return new FAProgram(program.getString("name"), srvList);
    }

    private void setFAObjectives(FAProgram program, String objectives) {
        List<Double> objValues = Arrays.stream(objectives.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        program.stmq = objValues.get(0);
        program.semq = objValues.get(1);
        program.rc = objValues.get(2);
        double result = 0;
        for (double value : objValues) {
            result += (1 - value) * (1 - value);
        }
        program.euclidianDis = Double.parseDouble(getFourBitsDoubleString(Math.sqrt(result)));
    }


    class FAProgram {
        public String name;
        public List<FAService> children;
        public double stmq;
        public double semq;
        public double rc;
        public double euclidianDis;

        public FAProgram(String name, List<FAService> children) {
            this.name = name;
            this.children = children;
        }
    }

    class FAService {
        public String name;
        public List<FA> children;

        public FAService(String name, List<FA> children) {
            this.name = name;
            this.children = children;
        }
    }

    class FA {
        public String name;
        public List<LeafFile> children;

        public FA(String name, List<LeafFile> children) {
            this.name = name;
            this.children = children;
        }
    }

    class FileProgram {
        public String name;
        public List<FileService> children;

        public FileProgram(String name) {
            this.name = name;
        }
    }

    class FileService {
        public String name;
        public List<LeafFile> children;

        public FileService(String name, List<String> children) {
            this.name = name;
            this.children = children.stream().map(LeafFile::new).collect(Collectors.toList());
        }
    }

    static long[][] record;

    public static long get(int n, int k) {
        if (n == k || k == 1) return 1;
        if (record[n][k] == 0) {
            record[n][k] = get(n-1, k-1) + k * get(n-1, k);
            if (record[n][k] < 0) {
                System.out.println("n: " + n + " k: " + k + " ; =" + record[n][k] + "、"+ get(n-1, k-1) + ", " + get(n-1, k));
            }
        }
        return record[n][k];
    }

    public static void main(String[] args) {
        int n = 65;
        record = new long[n+1][n+1];
        int result = 0;
        for (int groupNum = 1; groupNum <= n; groupNum++) {
            long cur = get(n, groupNum);
            result += cur;
            System.out.println("分配 " + n  + " 为 " + groupNum + " 堆：" + cur);
        }
        System.out.println(result);
    }
}

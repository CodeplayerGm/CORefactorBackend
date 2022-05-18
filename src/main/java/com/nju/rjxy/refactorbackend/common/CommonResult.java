package com.nju.rjxy.refactorbackend.common;

import java.util.List;

public class CommonResult {
    /**
     * 状态码解释
     * 200：正常完成
     * 404：缺少相关资源/数据/文件
     * 401：参数错误
     * 500：服务器异常
     *
     */
    private int code;
    private String msg;
    private List<?> list;
    private Object obj;

    public CommonResult() {
    }

    public CommonResult(int code, String msg, List<?> list, Object obj) {
        this.code = code;
        this.msg = msg;
        this.list = list;
        this.obj = obj;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

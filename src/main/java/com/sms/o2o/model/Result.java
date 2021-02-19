package com.sms.o2o.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
public class Result {

    /**
     * status : 0
     * msg :
     */

    private int status;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("1"));
    }
}

package com.sms.o2o.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Gavin Belson
 * @date 2021/6/2
 */
@Data
public class ResultStarBucks implements Serializable {

    /**
     * statusCode : 200
     * body : {"errorCode":0,"errorMessage":"success","data":null}
     */

    private int statusCode = 200;
    private BodyBean body;

    @Data
    public static class BodyBean implements Serializable {
        /**
         * errorCode : 0
         * errorMessage : success
         * data : null
         */

        private int errorCode;
        private String errorMessage;
        private Object data;
    }
}

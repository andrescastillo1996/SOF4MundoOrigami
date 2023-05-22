package com.uco.mundoorigami.domain;

public class StatusStepUser {

    private int code;
    private String condiction;

    private String status;

    public StatusStepUser(int code, String condiction, String status) {
        this.code = code;
        this.condiction = condiction;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCondiction() {
        return condiction;
    }

    public void setCondiction(String condiction) {
        this.condiction = condiction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

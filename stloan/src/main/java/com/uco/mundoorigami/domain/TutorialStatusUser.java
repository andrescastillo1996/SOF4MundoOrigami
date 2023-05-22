package com.uco.mundoorigami.domain;

public class TutorialStatusUser {

    private int code;
    private String Condition;

    private String status;

    public TutorialStatusUser(int code, String condition, String status) {
        this.code = code;
        Condition = condition;
        this.status = status;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

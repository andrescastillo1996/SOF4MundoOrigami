package com.uco.mundoorigami.domain;

public class TutorialStep {


    private int code;
    private int step;
    private int codeResource;
    private  String status;

    public TutorialStep(int code, int step, int codeResource,     String status) {
        this.code = code;
        this.step = step;
        this.codeResource = codeResource;
        this.status=status;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getCodeResource() {
        return codeResource;
    }

    public void setCodeResource(int codeResource) {
        this.codeResource = codeResource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

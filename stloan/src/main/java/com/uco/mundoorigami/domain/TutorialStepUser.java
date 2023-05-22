package com.uco.mundoorigami.domain;

public class TutorialStepUser {

    private int code;
    private int codeStepUser;

    private int stepTutorial;

    private int status;

    public TutorialStepUser(int code, int codeStepUser, int stepTutorial,int status) {
        this.code = code;
        this.codeStepUser = codeStepUser;
        this.stepTutorial = stepTutorial;
        this.status=status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeStepUser() {
        return codeStepUser;
    }

    public void setCodeStepUser(int codeStepUser) {
        this.codeStepUser = codeStepUser;
    }

    public int getStepTutorial() {
        return stepTutorial;
    }

    public void setStepTutorial(int stepTutorial) {
        this.stepTutorial = stepTutorial;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

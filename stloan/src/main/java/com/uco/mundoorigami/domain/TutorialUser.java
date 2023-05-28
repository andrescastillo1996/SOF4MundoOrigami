package com.uco.mundoorigami.domain;

public class TutorialUser {
    private int code;
    private int codeUser;
    private int codeTutorialOrigami;
    private int codeTutorialStepUser;
    private int codeStatusTutorialUser;
    private String status;


    public TutorialUser(int code, int codeUser, int codeTutorialOrigami, int codeTutorialStepUser, int codeStatusTutorialUser,String status) {
        this.code = code;
        this.codeUser = codeUser;
        this.codeTutorialOrigami = codeTutorialOrigami;
        this.codeTutorialStepUser = codeTutorialStepUser;
        this.codeStatusTutorialUser = codeStatusTutorialUser;
        this.status=status;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    public int getCodeTutorialOrigami() {
        return codeTutorialOrigami;
    }

    public void setCodeTutorialOrigami(int codeTutorialOrigami) {
        this.codeTutorialOrigami = codeTutorialOrigami;
    }

    public int getCodeTutorialStepUser() {
        return codeTutorialStepUser;
    }

    public void setCodeTutorialStepUser(int codeTutorialStepUser) {
        this.codeTutorialStepUser = codeTutorialStepUser;
    }

    public int getCodeStatusTutorialUser() {
        return codeStatusTutorialUser;
    }

    public void setCodeStatusTutorialUser(int codeStatusTutorialUser) {
        this.codeStatusTutorialUser = codeStatusTutorialUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

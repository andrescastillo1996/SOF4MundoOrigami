package com.uco.mundoorigami.domain;

public class TutorialOrigami {

    private int code;
    private int codeOrigami;
    private int codeTutorialStep;

    private String description;
    private String status;

    public TutorialOrigami(int codeOrigami, int codeTutorialStep, String description, String status) {

        this.codeOrigami = codeOrigami;
        this.codeTutorialStep = codeTutorialStep;
        this.description = description;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeOrigami() {
        return codeOrigami;
    }

    public void setCodeOrigami(int codeOrigami) {
        this.codeOrigami = codeOrigami;
    }

    public int getCodeTutorialStep() {
        return codeTutorialStep;
    }

    public void setCodeTutorialStep(int codeTutorialStep) {
        this.codeTutorialStep = codeTutorialStep;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

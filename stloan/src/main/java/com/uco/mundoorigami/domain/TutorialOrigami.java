package com.uco.mundoorigami.domain;

public class TutorialOrigami {

    private int code;
    private int codeOrigami;
    private int codeTutorialStep;

    private String description;
    private String status;
    private String level;
     private String category;


    public TutorialOrigami(int codeOrigami, int codeTutorialStep, String description, String status, String level, String category) {
        this.codeOrigami = codeOrigami;
        this.codeTutorialStep = codeTutorialStep;
        this.description = description;
        this.status = status;
        this.level = level;
        this.category = category;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

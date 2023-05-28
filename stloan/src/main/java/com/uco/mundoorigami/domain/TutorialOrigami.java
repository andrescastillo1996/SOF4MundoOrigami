package com.uco.mundoorigami.domain;

public class TutorialOrigami {

    private int code;

    private String name;
    private String description;
    private String status;
    private String level;
    private String category;


    public TutorialOrigami(int code, String name, String description, String status, String level, String category) {
        this.code = code;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

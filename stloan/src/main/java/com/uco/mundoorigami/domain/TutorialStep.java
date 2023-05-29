package com.uco.mundoorigami.domain;

public class TutorialStep {
    private int code;
    private long origamiTypeId;
    private int tutorialId;
    private int orden;
    private String name;
    private String description;

    private String status;
    private String imageURL;

    public TutorialStep(int code, long origamiTypeId, int tutorialId, int orden, String name, String description, String status, String imageURL) {
        this.code = code;
        this.origamiTypeId = origamiTypeId;
        this.tutorialId = tutorialId;
        this.orden = orden;
        this.name = name;
        this.description = description;
        this.status = status;
        this.imageURL = imageURL;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getOrigamiTypeId() {
        return origamiTypeId;
    }

    public void setOrigamiTypeId(long origamiTypeId) {
        this.origamiTypeId = origamiTypeId;
    }

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
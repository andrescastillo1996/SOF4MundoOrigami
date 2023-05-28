package com.uco.mundoorigami.domain;

public class Origami {
    private int code;
    private long origamiTypeId;

    private int tutorialId;
    private String name;
    private String status;
    private String imageURL;


    public Origami(int code, long origamiTypeId, int tutorialId, String name, String status, String imageURL) {
        this.code = code;
        this.origamiTypeId = origamiTypeId;
        this.tutorialId = tutorialId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

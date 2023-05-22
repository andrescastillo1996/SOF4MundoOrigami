package com.uco.mundoorigami.domain;

public class Origami {
    private int code;
    private long origamiTypeId;
    private String name;
    private String status;

    private String imageURL;

    public Origami(int code, long origamiTypeId, String name, String status, String imageURL) {
        setCode(code);
        setOrigamiTypeId(origamiTypeId);
        setName(name);
        setStatus(status);
        setImageURL(imageURL);
    }

    private void setCode(int code) {
        this.code = code;
    }


    private void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public long getOrigamiTypeId() {
        return origamiTypeId;
    }

    public void setOrigamiTypeId(long origamiTypeId) {
        this.origamiTypeId = origamiTypeId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

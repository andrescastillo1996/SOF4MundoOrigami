package com.uco.mundoorigami.domain;

public class Resource {


    private int code;

    private String material;

    private String description;

    private  String status;

    public Resource(int code, String material, String description, String status) {
        this.code = code;
        this.material = material;
        this.description = description;
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMaterial() {
        return material;
    }

    public String getDescription() {
        return description;
    }
}

package com.uco.mundoorigami.domain;

public class OrigamiType {

    private int code;
    private String name;
    private String description;
    private String status;

    public OrigamiType(int code, String name, String status, String description) {
        setCode(code);
        setName(name);
        setStatus(status);
        setDescription(description);
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private  void setCode(int code) {
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
}

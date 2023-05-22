package com.uco.mundoorigami.domain;

public class OrigamiType {

    private int code;
    private String name;
    private String status;

    public OrigamiType(int code, String name, String status) {
        setCode(code);
        setName(name);
        setStatus(status);
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
}

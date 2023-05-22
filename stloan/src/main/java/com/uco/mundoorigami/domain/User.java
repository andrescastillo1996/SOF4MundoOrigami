package com.uco.mundoorigami.domain;



public class User {
    private int code;
    private String name;
    private  String email;
    private String password;
    private String status;

    public User( int code, String name, String email, String password,String status) {

        setCode(code);
        setName(name);
        setEmail(email);
        setPassword(password);
        setStatus(status);
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

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

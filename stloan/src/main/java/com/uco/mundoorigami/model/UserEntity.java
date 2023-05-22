package com.uco.mundoorigami.model;

import javax.persistence.*;

import javax.validation.constraints.Email;

@Entity
@Table(name="USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    @Email
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;



    public UserEntity( ) {
    }

    public UserEntity(int code, String name, String email, String password, String status) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int id) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

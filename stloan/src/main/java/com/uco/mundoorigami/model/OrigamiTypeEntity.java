package com.uco.mundoorigami.model;


import javax.persistence.*;

@Entity
@Table(name = "ORIGAMI_TYPE")
public class OrigamiTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name="name")
    private String name;
    @Column(name="status")
    private String status;


    public OrigamiTypeEntity()
    {


    }
    public OrigamiTypeEntity(int code, String name, String status) {
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

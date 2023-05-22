package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name="RESOURCE")
public class ResourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "Material")
    private String material;
    @Column(name = "Descripcion")
    private String description;

    @Column(name="status")
    private String status;




    public ResourceEntity(  String material, String description, String status) {


        this.material = material;
        this.description = description;
        this.status = status;
    }
    public ResourceEntity()
    {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
}

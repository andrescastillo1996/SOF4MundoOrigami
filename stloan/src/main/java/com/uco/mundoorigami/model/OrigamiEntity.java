package com.uco.mundoorigami.model;


import javax.persistence.*;

@Entity
@Table(name = "ORIGAMI")
public class OrigamiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "tutorial_id")
    private int tutorialId;
    @Column(name = "origami_type_id")
    private long origamiTypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;
    @Column(name = "imageURL")
    private String imageURL;

    public OrigamiEntity() {

    }

    public OrigamiEntity(int code, int tutorialId, long origamiTypeId, String name, String status, String imageURL) {
        this.code = code;
        this.tutorialId = tutorialId;
        this.origamiTypeId = origamiTypeId;
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

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
    }

    public long getOrigamiTypeId() {
        return origamiTypeId;
    }

    public void setOrigamiTypeId(long origamiTypeId) {
        this.origamiTypeId = origamiTypeId;
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

package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name = "TUTORIAL_STEP")
public class TutorialStepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "tutorial_id")
    private int tutorialId;
    @Column(name = "origami_type_id")
    private long origamiTypeId;
    @Column(name = "name",length = 500)
    private String name;
    @Column(name = "status")
    private String status;
    @Column(name = "imageURL")
    private String imageURL;

    @Column(name="description",length=10000)
    private String description;

    @Column(name = "order_step")
    private int order;

    public TutorialStepEntity() {
    }

    public TutorialStepEntity(int code, int tutorialId, long origamiTypeId, String name, String status, String imageURL, String description, int order) {
        this.code = code;
        this.tutorialId = tutorialId;
        this.origamiTypeId = origamiTypeId;
        this.name = name;
        this.status = status;
        this.imageURL = imageURL;
        this.description = description;
        this.order = order;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

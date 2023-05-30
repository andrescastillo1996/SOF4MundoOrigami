package com.uco.mundoorigami.model;
import javax.persistence.*;

@Entity
@Table(name="TUTORIAL_ORIGAMI")
public class TutorialOrigamiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name="name", length = 500)
    private String name;

    @Column(name="description",length=10000)
    private String description;
    @Column(name = "status")
    private String status;
    @Column(name="level")
    private String level;
    @Column(name="category")
    private String category;
    public TutorialOrigamiEntity() {}

    public TutorialOrigamiEntity(int code, String name, String description, String status, String level, String category) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.status = status;
        this.level = level;
        this.category = category;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

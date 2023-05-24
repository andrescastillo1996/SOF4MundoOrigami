package com.uco.mundoorigami.model;
import javax.persistence.*;

@Entity
@Table(name="TUTORIAL_ORIGAMI")
public class TutorialOrigamiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name="codeOrigami")
    private int codeOrigami;
    @Column(name="codeTutorialStep")
    private int codeTutorialStep;
    @Column(name="description")
    private String description;
    @Column(name = "status")
    private String status;
    @Column(name="level")
    private String level;
    @Column(name="category")
    private String category;
    public TutorialOrigamiEntity()
    {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeOrigami() {
        return codeOrigami;
    }

    public void setCodeOrigami(int codeOrigami) {
        this.codeOrigami = codeOrigami;
    }

    public int getCodeTutorialStep() {
        return codeTutorialStep;
    }

    public void setCodeTutorialStep(int codeTutorialStep) {
        this.codeTutorialStep = codeTutorialStep;
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

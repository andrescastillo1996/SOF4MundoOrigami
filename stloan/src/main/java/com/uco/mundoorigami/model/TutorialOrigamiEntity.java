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

    public TutorialOrigamiEntity()
    {

    }
    public TutorialOrigamiEntity(int codeOrigami, int codeTutorialStep, String description, String status) {

        this.codeOrigami = codeOrigami;
        this.codeTutorialStep = codeTutorialStep;
        this.description = description;
        this.status = status;
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
}

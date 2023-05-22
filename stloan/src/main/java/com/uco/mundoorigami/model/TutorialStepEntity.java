package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name="TUTORIAL_STEP")
public class TutorialStepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "step")
    private int step;
    @Column(name = "codeRecurso")
    private int codeResource;
    @Column(name = "status")
    private  String status;

    public TutorialStepEntity(int code, int step, int codeResource,String status) {
        this.code = code;
        this.step = step;
        this.codeResource = codeResource;
        this.status=status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getCodeResource() {
        return codeResource;
    }

    public void setCodeResource(int codeResource) {
        this.codeResource = codeResource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

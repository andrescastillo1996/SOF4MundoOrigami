package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name="TUTORIAL_STEP_USER_ENTITY")
public class TutorialStepUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "codeStepUser")
    private int codeStepUser;
    @Column(name="stepTutorial")
    private int stepTutorial;
    @Column(name = "status")
    private String status;

    public TutorialStepUserEntity(int code, int codeStepUser, int stepTutorial, String status) {
        this.code = code;
        this.codeStepUser = codeStepUser;
        this.stepTutorial = stepTutorial;
        this.status=status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeStepUser() {
        return codeStepUser;
    }

    public void setCodeStepUser(int codeStepUser) {
        this.codeStepUser = codeStepUser;
    }

    public int getStepTutorial() {
        return stepTutorial;
    }

    public void setStepTutorial(int stepTutorial) {
        this.stepTutorial = stepTutorial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

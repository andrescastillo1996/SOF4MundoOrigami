package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name="TUTORIAL_USER_ENTITY")
public class TutorialUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
   @Column(name="codeUser")
    private int codeUser;
    @Column(name="codeTutorialOrigami")
    private int codeTutorialOrigami;
    @Column(name="codeTutorialStepUser")
    private int codeTutorialStepUser;
    @Column(name="CodeStatusTutorialUser")
    private int CodeStatusTutorialUser;
    @Column(name="status")
    private String status;



    public TutorialUserEntity(int code, int codeUser, int codeTutorialOrigami, int codeTutorialStepUser, int codeStatusTutorialUser,String status) {
        this.code = code;
        this.codeUser = codeUser;
        this.codeTutorialOrigami = codeTutorialOrigami;
        this.codeTutorialStepUser = codeTutorialStepUser;
        this.CodeStatusTutorialUser = codeStatusTutorialUser;
        this.status=status;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    public int getCodeTutorialOrigami() {
        return codeTutorialOrigami;
    }

    public void setCodeTutorialOrigami(int codeTutorialOrigami) {
        this.codeTutorialOrigami = codeTutorialOrigami;
    }

    public int getCodeTutorialStepUser() {
        return codeTutorialStepUser;
    }

    public void setCodeTutorialStepUser(int codeTutorialStepUser) {
        this.codeTutorialStepUser = codeTutorialStepUser;
    }

    public int getCodeStatusTutorialUser() {
        return CodeStatusTutorialUser;
    }

    public void setCodeStatusTutorialUser(int codeStatusTutorialUser) {
        CodeStatusTutorialUser = codeStatusTutorialUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name = "TUTORIAL_STATUS_USER")
public class TutorialStatusUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name ="conditon")
    private String Condition;
    @Column(name="status")
    private String status;

    public TutorialStatusUserEntity(int code, String condition , String status) {
        this.code = code;
        Condition = condition;
        this.status=status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

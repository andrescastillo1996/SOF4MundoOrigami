package com.uco.mundoorigami.model;

import javax.persistence.*;

@Entity
@Table(name ="STATUS_STEP_USER")
public class StatusStepUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "condiction")
    private String condiction;

    @Column(name="status")
    private String status;

    public StatusStepUserEntity(int code, String condiction, String status) {
        this.code = code;
        this.condiction = condiction;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCondiction() {
        return condiction;
    }

    public void setCondiction(String condiction) {
        this.condiction = condiction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

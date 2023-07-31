package com.ConvinienceStore.storeWK2.model;

import com.ConvinienceStore.storeWK2.Enums.Roles;
import com.ConvinienceStore.storeWK2.Enums.Sex;

import java.time.LocalDate;

public class Staff extends BaseClass {
    private String idNum;
    private Roles role;

    public Staff(String name, Sex sex, String idNum, Roles role) {
        super(name, sex);
        this.idNum = idNum;
        this.role = role;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "idNum='" + idNum + '\'' +
                ", role=" + role +
                '}';
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}

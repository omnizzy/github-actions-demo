package com.ConvinienceStore.storeWK2.model;

import com.ConvinienceStore.storeWK2.Enums.Qualification;
import com.ConvinienceStore.storeWK2.Enums.Sex;

public class Applicant extends BaseClass {
    private String applicationNumber;
    private Qualification qualification;
    private Integer age;

    public Applicant(String name, Sex sex, String applicationNumber, Qualification qualification, Integer age) {
        super(name, sex);
        this.applicationNumber = applicationNumber;
        this.qualification = qualification;
        this.age = age;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationNumber='" + applicationNumber + '\'' +
                ", qualification=" + qualification +
                ", age=" + age +
                '}';
    }
}

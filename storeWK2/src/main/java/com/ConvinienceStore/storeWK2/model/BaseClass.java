package com.ConvinienceStore.storeWK2.model;

import com.ConvinienceStore.storeWK2.Enums.Sex;

public abstract class BaseClass {
    private String name;
    private Sex sex;

    public BaseClass(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}


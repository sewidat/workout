package com.example.workout.model;

import android.text.Editable;

public class UserDetails {
    private String name;
    private int age;
    private double wight;
    private double height;

    public UserDetails(String name, int age, double wight, double height) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                ", height=" + height +
                '}';
    }
}

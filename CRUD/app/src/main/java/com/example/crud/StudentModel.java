package com.example.crud;

public class StudentModel {
    private String name;
    private String rollNmber;
    private int isEnroll;


    public StudentModel(String string, int anInt, boolean b) {
    }



    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", rollNmber=" + rollNmber +
                ", isEnroll=" + isEnroll +
                '}';
    }

    public StudentModel(String name, String rollNmber, int isEnroll) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(String rollNmber) {
        this.rollNmber = rollNmber;
    }

    public int isEnroll() {
        return isEnroll;
    }

    public void setEnroll(int enroll) {
        isEnroll = enroll;
    }
}

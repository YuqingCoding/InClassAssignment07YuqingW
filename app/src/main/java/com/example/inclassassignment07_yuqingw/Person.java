package com.example.inclassassignment07_yuqingw;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String gender;
    private String field;
    private boolean stillAlive;

    public Person(String name,String gender,String field,boolean stillAlive){
        this.name = name;
        this.gender = gender;
        this.field = field;
        this.stillAlive = stillAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setStillAlive(boolean stillAlive) {
        this.stillAlive = stillAlive;
    }

    public boolean getStillAlive() {
        return stillAlive;
    }

    public String toString(){
        return "Person: " + name + "\nGender: " + gender + "\nField: " + field + "\nIs this person still alive? " + stillAlive;
    }
}
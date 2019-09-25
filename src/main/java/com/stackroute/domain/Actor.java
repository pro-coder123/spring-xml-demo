package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display()
    {
        System.out.println(this.name);
    }


}

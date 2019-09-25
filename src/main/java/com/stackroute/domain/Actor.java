package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;


//


    public Actor()
    {

    }
    public Actor(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

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

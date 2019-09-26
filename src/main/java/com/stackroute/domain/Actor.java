package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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

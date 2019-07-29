package com.stackroute.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor  {
    @Autowired
    private int age;
    private String name;
    private String gender;


    public Actor() {
    }

    @Autowired
    public Actor(int age, String name, String gender) {

        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    @Autowired
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    @Autowired
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}

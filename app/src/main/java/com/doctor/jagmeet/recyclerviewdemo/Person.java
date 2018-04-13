package com.doctor.jagmeet.recyclerviewdemo;


/**
 * Created by sjagm on 12-04-2018.
 */

public class Person {
    String name;
    String age;

    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//! We can use @Scope("prototype") in this situation, because every "User" object should be unique.
//! Use @Scope("prototype") in "AppConfig" not here.
public class User {
    public String name;
    private int age;

    public User(String name, int age){
        System.out.println("User object created.");
        this.name = name;
        this.age = age;
    }
}
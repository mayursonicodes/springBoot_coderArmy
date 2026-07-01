package org.example;

import org.springframework.stereotype.Component;

//! @Component
//! We can not use @Component here, because Spring tries to create the bean automatically in IOC container, but our constructor requires name and age. But Spring doesn't know what values to provide, so we will get an error.
//! To resolve it, we will create bean manually in AppConfig file.
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
}
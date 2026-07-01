package org.example.demonstrate_example;

//! Example of Circular Dependency
public class B {
    A a;

    public B(A a){
        this.a = a;
    }
}
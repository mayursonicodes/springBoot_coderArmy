package org.example.demonstrate_example;

//! Example of Circular Dependency
public class A {
    B b;

    public A(B b){
        this.b = b;
    }
}
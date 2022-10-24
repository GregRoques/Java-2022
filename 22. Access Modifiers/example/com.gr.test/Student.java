package com.gr.test;

public class Student {
    int age = 27; // default... same as private;
    public int rollno = 8; // assessible anywhere
    private String name = "Callie"; // only available in this class
    protected int marks = 10; // accessible in any class in this package, and any sub-class of other package
}

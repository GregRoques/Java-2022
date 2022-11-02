public class InnerDemo {
    
}
package com.gr;

import com.gr.test.*; // .* imports all classes from package;

class HighSchooler extends Student {
    public getMarks(){
        System.out.println(marks)
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.marks = 99; // this won't work;
    }
}
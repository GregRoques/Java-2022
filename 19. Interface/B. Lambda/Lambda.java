// 3 Types of Interface:
//      1. Normative - multiple method
//      2. Functional Interface (formerly Single Abstract Method) - one method ... uses Lambda Expressions (taken from Scala language)
//      3. Marker Interface - no methods

interface ABC {
    void show();
}

public class Lambda {
    public static void main(String[] args) {
        ABC obj = () -> System.out.println("I'm the best");
            
        };obj.show();
}}

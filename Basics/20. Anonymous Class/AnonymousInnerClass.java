class A {
    public void show() {
        System.out.println("in A show")
    }
}

// class B extends A {
// public void show(){
// System.out.println("I'm the best")
// }
// }
// it is bad practice to extend a new class just to override something from a
// super class

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("I'm the best");
            };
        }; // this creates a new class that does not have a name
           // useful for creating a class for one-time use;
    }
}

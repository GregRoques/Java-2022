class A {
    public void show() {
        System.out.println("A");
    }
}

class B extends A {
    public void show() {
        System.out.println("B");
    }

    public void config(){
        System.out.println("Config")
    }
}

class C extends A {
    public void show() {
        System.out.println("C");
    }
}

public class DMD {

    // compile time vs. runtime
    public static void main(String[] args) {
        A obj1 = new B(); // ... possible, b/c A is super class
        // this works b/c A is the reference, and B is the implementation;

        // reference and implementation are linked at runtime
        // This is called "RUNTIME POLYMORPHISM"
        obj1.show();

        obj1.config(); // won't work, as A -- the reference -- does not know about "config"
        // can only call methods also in Super

        obj1 = new C();
        obj1.show(); // now will call C;

        // everytime method is reassigned, it is called "DYNAMIC METHOD DISPATCH"
    }
}

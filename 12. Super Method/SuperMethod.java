class A {
    public A() { // first constructor is always "super()" -- or default -- by default
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int i) {
        super(i); // this will call this value first, but won't execute until super class executes
        System.out.println("in B int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {

        // A obj1 = new A(); // will call constructor of A

        B obj2 = new B(); // Calls A and B... sub calls Super- and Sub- class
        // constructors

        // B obj3 = new B(1); // calls first (default, or "Super") constructor in A, and
        // matching constructor
        // (2) in B

    }
}

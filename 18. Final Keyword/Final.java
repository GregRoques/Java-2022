class A {
    final int I = 0; // this makes variable a constant... like "const" in JS
    // it is convention to put constants in all caps; ex.: final int DAY = 0;

    final int DAY = 0;

    public final void show() {
        System.out.println("I'mma show you some s**t when I press that button");
    }
}

final class B {
    public void show() {
        System.out.println(1 + 1);
    }
}

class C extends B { // this won't work now, as you can't inherit from a final class

}

class D extends A {
    public void show() { // can't over-ride a final function
        System.out.println("The trunk went eh-eh, and all of a sudden");
    }
}

public class Final {

    public static void main(String[] args) {

        C obj = new C();
        obj.show();
    }

}

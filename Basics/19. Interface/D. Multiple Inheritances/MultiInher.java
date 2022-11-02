@FunctionalInterface
interface MyDemo {
    default public void show() {
        System.out.println("Go DJ");
    }

}

interface MyDemo2 {
    default public void show() {
        System.out.println("That's my DJ");
    }
}

class MyDemoImpl implements MyDemo, MyDemo2 {

    /*
     * One solution:
     */

    default public void show() {
        System.out.println("I got army guns");
    }

    /*
     * Another way to solve this is below:
     */

    @Override
    public void show() {
        MyDemo.super.show();
    }
}

public class MultiInher {
    public static void main(String[] args) {
        MyDemoImpl obj = new MyDemoImpl();
        MyDemoImpl.show(); // won't work, as duplicate default methods are inherited
        //
        // one way to solve this is to call your OWN method in the implementing class
        // (see
        // above)
        //
        // the other is to Overide with one of the super classes (BOTH interfaces are
        // SUPER classes.)
    }
}

interface Demo {
    void abc();

    default public void show() {
        System.out.println("Let's go...");
    }
    // in Java versions earlier than 1.8, you could not define a method
    // you can now, but must use "default" when doing so
}

class DemoImplementation implements Demo {
    public void abc() {
        System.out.println("defining that abc...");
    }
}

public class Default {
    public static void main(String[] args) {
        Demo obj = new DemoImplementation();
        obj.abc();
        obj.show();
    }
}

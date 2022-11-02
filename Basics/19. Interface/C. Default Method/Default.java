@FunctionalInterface // if performing check to see if this is a function (single abstract) method, it
                     // comes back true
// that is because it has 1 abstract method... AND 1 default
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

    public void show(){
        System.out.println('NEW SHOW!!!')
    } // this WILL OVERRIDE interface
}

public class Default {
    public static void main(String[] args) {
        Demo obj = new DemoImplementation();
        obj.abc();
        obj.show();
    }
}

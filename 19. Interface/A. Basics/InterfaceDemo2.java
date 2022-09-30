interface ABC {
    void show();
}

class Implementor implements ABC {
    public void show() {
        System.out.println("anything");
    };
}

public class InterfaceDemo2 {

    public static void main(String[] args) {
        ABC obj = new Implementor(); // can create reference to interface, but instantiate class that implements
        obj.show(); // this works
    }
}

interface ABC {
    void show();
}

class Implimentor implements ABC {
    public void show() {
        System.out.println("anything");
    };
}

public class InterfaceDemo2 {

    public static void main(String[] args) {
        ABC obj = new Implimentor(); // can create reference to interface, but instantiate class that implements
        obj.show(); // this works
    }
}

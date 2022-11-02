interface Demo {
    int num = 9; // constant (final) by default in Demo;

    void abc();

    default static void show() {
        System.out.println(num);
    }
}

class DemoImpl implements Demo {
    public void abc() {
        num = 9;// won't work, as cannot override a constant;
    }
}

public class StaticMeth {
    public static void main(String[] args) {
        Demo.show(); // only way to call static method... can't call with implementation
    }
}

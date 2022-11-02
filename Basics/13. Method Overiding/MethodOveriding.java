class A {
    public void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override // now, this allows the "Sub" to overide the Super
    public void show() {

        // if you want to call A also, call: super.show();
        System.out.println("B");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(); // will only print A to console... as Super, it over-rides B
    }
}

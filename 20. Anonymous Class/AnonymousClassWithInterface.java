interface ABC {
    void show();
}

// class Implementor implements ABC {
// public void show() {
// System.out.println("holla");
// }
// }

public class AnonymousClassWithInterface {
    public static void main(Strin[] args) {
        // ABC obj = new Implementor();

        ABC obj = new ABC() {
            public void show() {
                System.out.println("I'm an Anonymous Class with an Interface.");
            }
        };

        obj.show();
    }
}

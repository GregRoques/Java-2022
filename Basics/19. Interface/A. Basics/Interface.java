// abstract class Writer {
//     abstract public void write();
// }

// class Pen extends Writer {
//     public void write() {
//         System.out.println("I'm a pen.");
//     }
// }

class ABC {

}

interface Writer {
    void write();
} // an "Interface" is a completely abstract, public classes that is used to group
  // related methods with empty bodies

class Pen extends ABC implements Writer {
    // b/c Java does not support multiple inheritances, can't extend 2 classes
    // you can extend a class and implement a class on a new class
    public void write() {
        System.out.println("I'm a pen.");
    }
}

class Pencil extends Writer {
    public void write() {
        System.out.println("I'm a pencil.");
    }
}

class Kit {
    public void doSomething(Writer p) {
        p.write();
    }
}

public class Interface {
    public static void main(String[] args) {
        Kit k = new Kit();
        Pen p = new Pen();

        Pencil pc = new Pencil();

        k.doSomething(p);
        k.doSomething(pc);
    }
    // like abstract classes, we cannot create an instance of an interface, just a
    // reference;
}
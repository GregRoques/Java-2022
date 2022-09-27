abstract class Human {

    // makes it so that your class cannot instantiate instance of class
    public abstract void eat(); // can have abstract method as well... can only call if class is abstract

    public void walk() {

    }
}

class Man extends Human { // extension of abstract class is called a "Concrete" class
    public void eat() {

    } // must define here as eat is abstract in super;
} // abstract can be extended, but not instantiated

public class Abstract {
    public static void main(String[] args) {
        // Human obj = new Human(); ... won't work b/c method is abstract

        Human obj = new Man(); // this will work

    }
}

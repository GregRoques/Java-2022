/*
 * Inner Class:
 *   Member Class - normal class without static
 *   Static Class
 *   Anonymous Class
 * 
 * 
 */

class Outer {
    int a;

    public void show() {
        System.out.println("What are cats?");
    }

    class Inner { // when compiled, will read Outer$Inner.class (see inside of this folder for
                  // example)
        public void display() {
            System.out.println("Cats are Awesome!!!");
        }
    }

    static class statExample {
        public void display() {
            System.out.println("Of course they are!");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner(); // must call the outer object created above;
        obj1.display();

        Outer.Inner obj2 = new Outer.Inner(); // because it is static, you do not need to call the object
        obj2.display();
    }
}

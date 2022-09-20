class Emp {
    int eid;
    int salary;
    static String ceo; // specifies for class... not object; makes it so all objects will share same
                       // value;

    static {
        ceo = "Wario";
        System.out.println("in static");
    } // executes when you call a class

    public Emp() { // executed when you create an object
        eid = -1;
        salary = 15;
        System.out.println("in constructor");
    }

    public void show() { // it is void, because it has no return value
        System.out.println("EID: " + eid + ", Salary: " + salary + ", CEO: " + ceo);
    }
}

public class Staticdemo {
    static int yoshi = 1; // this must be static to be accessed within the static block below.

    public static void main(String[] args) {

        System.out.println(yoshi); // REMEMBER: You cannot access a non-static variable in a variable block...
                                   // yoshi MUST be static

        Emp Esti = new Emp();
        Esti.eid = 1;
        Esti.salary = 1000000;
        // Esti.ceo = "Luigi"; this is bad... don't call object (<= like this), call
        // class
        // Emp.ceo = "Luigi";
        Esti.show();

        Emp Midnight = new Emp();
        Midnight.eid = 14;
        Midnight.salary = 10;
        // Midnight.ceo = "Mario";
        // Emp.ceo = "Mario";
        Midnight.show();

        Emp Callie = new Emp();
        Callie.show();

        Emp Nacheaux = new Emp();
        Nacheaux.show();
    }
}

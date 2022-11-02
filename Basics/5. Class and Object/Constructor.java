//constructor must have same name as class
//if you don't declare one, there is a default constructor working in the background
//is a member method -  provide an application with access to the data of an object instance. 
//will never return anything
//used to allocate memory
//constructor is called automatically when you create an instance... you don't need to call it

//=======================================================================================================

class Calc {
    int num1;
    int num2;
    int result;

    // ==================================== multiple constructors are ok, as long as
    // they have differing parameters;
    public Calc() { // same as classname ; doesn't return a value; called automatically when object
                    // instance is created
        num1 = 5;
        num2 = 5; // if you don't define, it is 0 (not null or undefined)
    }

    public Calc(int n) { // second class, but takes parameter
        num1 = n;
        num2 = n;
    }

    public Calc(double d) {
        num1 = (int) d;
        num2 = 5;
    }

    public void perform() {
        result = num1 + num2;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Calc obj = new Calc(); // you are calling the constructor here
        obj.num1 = 3;
        obj.num2 = 5;
        obj.perform();
        System.out.println(obj.result);
    }
}
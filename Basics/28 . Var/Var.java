class Alien {
    public void show(){
        System.out.println('Hellow');
    }
}

public class Var {
    var num = 10; // ... var won't work in global scope

    public static void main(String args[]) {
        int a = 9;
        // can also do...
        var b = 8;
        // since 'type' is assigned at compile time, it converts this to an int...
        // keeping with static-type language

        // ============================================== for unassigned variables
        int c;
        var d; // ... this will throw an error as it cannot initialize with a type

        // ============================================== for Array
        int nums[] = new int[10];

        var nums = new int[10]; // ... as it assigns type at runtime, you don't need to include [] in variable
                                // name -- you will get an error if you do

        // ============================================== for Class

        Alien obj = new Alien();

        var obj = new Alien(); // ... also works

    }
}

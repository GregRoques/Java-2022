//int, float, double are Primitive data types... or anything that is not an object
//Integer is a class

public class Wrapper {
    public static void main(String[] args) {
        int i = 5; // Primitive data type

        Integer j = new Integer(5); // Wrapper (also called Box) Class... deprecated as they move slower
        // there are certain instances will not let you use primitive types, hence why
        // this exists

        int k = j.intValue(); // calling the value is unboxing (or unwrapping)

        Integer value = i; // same as new Integer(i)... this short cut is called auto-boxing or
                           // auto-wrapping
        int l = value; // auto-unboxing

        // ==============================================================

        String str = "123";

        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
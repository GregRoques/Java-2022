public class variables {
    public static void main(String args[]) {
        // int, float, double
        int num = 8;
        num = num - 3;
        System.out.println(num);

        double num2 = 5.5;
        float num3 = 5.5f; // must include f if a float; float is less precise, but calculates faster than
                           // double

        System.out.println(num2);
        System.out.println(num3);

        // =================================================

        // short vs. int ... determines amount of memory used... each has different
        // number range

        long l = 5l; // 8 bytes > 64 bits ... must include l at end
        int i = 5; // 4 bytes > 32 bits
        short s = 5; // 2 bytes > 16 bits
        byte b = 5; // 1 byte > 8 bits ... num range very small: -128 to 127

        double d = 5.5; // 4 bytes ... default data type for dealing with float-point -- or decimal --
                        // numbers
        float f = 5.5f; // 2 bytes (remember to use f at end)

        // strings

        char c = 'A';
        System.out.println(c); // prints 'A'

        c = 66;
        System.out.println(c); // prints 'B'... because it is printing the keyboard character assigned to the
                               // key B
    }
}
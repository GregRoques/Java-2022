public class Arithmetic {
    /*
     * Arithmetic
     * Bitwise
     * Relational
     * Logical
     * 
     */

    public static void main(String[] args) {
        int m = 6, n = 2;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        int r4 = m / n; // won't return decimal, will round
        double r5 = (double) m / n;
        int r6 = m % n; // finds remainder in division;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        m = ++n; // pre-increment... increments n before assigning to m
        // m = n++; //post-increment... increments n AFTER assigning to m
        r1 = m + n;
        r2 = m - n;
        r3 = m * n;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}

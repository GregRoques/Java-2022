public class TwoD {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4 };
        int b[] = { 5, 6, 7, 8 };
        int c[] = { 9, 10, 11, 12 };

        int d[][] = {
                a,
                b,
                c
        };

        System.out.println(d[0]); // will give you: 1,2,3,4
        System.out.println(d[0][1]); // gives you: 2
    }
}

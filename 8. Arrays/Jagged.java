public class Jagged {
    public static void main(String args[]) {
        int d[][] = {
                { 0, 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        }; // when array columns are not even, it is a jagged array

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println(d[i][j]);
            }
        }
    }

}

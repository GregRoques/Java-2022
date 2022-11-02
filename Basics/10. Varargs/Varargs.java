class Calc {
    // public int add(int i, int j) {
    // return i + j;
    // }

    public int add(int... i) { // allows you to pass unlimited values and styles them as an array;
        // called "Variable Array Arguments"
        int sum = 0;
        for (int n : i) {
            sum += n;
        }
        return sum;
    }
}

public class Varargs {
    // varargs stands for "Variable Arguments"

    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1));

    }
}

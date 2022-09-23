//IS-A, HAS-A

// Java does not support multiple inheritance to avoid ambiguity: ex., "CalcAdv3 extends Cac, CalcAdv{}"

class Calc { // Super class
    public int add(int i, int j) {
        return i + j; // HAS-A
    }
}

class CalcAdv extends Calc { // Sub Class
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVAdv extends CalcAdv { // multi-level inheritance
    public int multi(int i, int j) {
        return i * j;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        CalcAdv c1 = new CalcAdv();
        int result1 = c1.add(5, 4);
        System.out.println(result1);

        int result2 = c1.sub(5, 4);
        System.out.println(result2);
    }
}

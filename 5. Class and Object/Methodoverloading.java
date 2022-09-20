class Casio {

    int num1;
    int num2;
    String operation;

    public Casio() {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i) {
        num1 = 1;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int j, int k) {
        num1 = j;
        num2 = k;
        operation = "Nothing";
    }

    public Casio(int l, int m, String n) {
        num1 = l;
        num2 = m;
        operation = n;
    }

    public void add(int g, int h) {
        System.out.println(g + h);
    }

    public void add(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public void add(double l, double m) {
        System.out.println(l + m);
    }

}

public class Methodoverloading {
    public static void main(String[] args) {
        Casio obj = new Casio(4, 5, "Add");

        System.out.println(obj.operation);

        obj.add(obj.num1, obj.num2);

        obj.add(4, 3, 5);

        obj.add(4.5, 3.8);
    }
}

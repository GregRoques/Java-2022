class Calc {
    int num1;
    int num2;
    int result; // if you don't assign a value, default is 0;

    public void perform() {
        result = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {

        Calc obj = new Calc(); // get object from class;
        obj.num1 = 3;
        obj.num2 = 5;
        obj.perform();
        System.out.println(obj.result);
    }
}
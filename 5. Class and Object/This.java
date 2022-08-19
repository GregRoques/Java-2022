class Calc {
    int number1;
    int number2;
    int result;

    public Calc(int number1, int number2) {
        this.number1 = number1; // this binds to Object... the equal-to variable is the one being passed
        this.number2 = number2;
    }

    public void perform() {
        result = number1 + number2;
    }
}

public class This {
    public static void main(String[] args) {

        Calc obj = new Calc(4, 5);

        System.out.println(obj.result);
    }
}
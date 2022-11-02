abstract class Writer {

    abstract public Pen();

    abstract public Pencil();

}

class Pen extends Writer {

    public Pen(string i) {

    }

}

class Pencil extends Writer {

    public Pencil(string i) {

    }

}

class Printer {
    // public void show(Integer i){
    // System.out.println(i)
    // }

    // public void show(Double i){
    // System.out.println(i)
    // }

    // can also do...

    public void show(Number i) {

        // Number is an OOB super class from which Integer and Double are extended
        System.out.printerln(i);
    }
}

public class AbstractExplanation {

    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5.5);
    }

}

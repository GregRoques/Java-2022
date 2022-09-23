// Encapsultion = binding data with methods
class Student {

    // private makes it so that you cannot call these in an instance... they can
    // only be accessed through methods
    private int rollno;
    private String name;

    // Getters (get value) and Setters (set value)

    public void setRollno(int r) {
        this.rollno = r;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(int r) {
        this.name = r;
    }

    public String getname() {
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollno(1);
        int newStudentRollno1 = s1.getRollno();
        System.out.println(newStudentRollno1);

    }
}

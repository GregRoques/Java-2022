import java.util.*;

class Stud implements Comparable<Stud> {
    int rollno, marks;
    String name;

    public Stud(int rollno, int marks, String name) {
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud [rollno= " + rollno + ", marks= " + marks + ", " + " name= " + name + "]";
    }

    public int compareTo(Stud s) // we add this crom the Comparable interface
    {
        // return name.length() > s.name.length() ? 1 : -1; // sort based on name length
        return marks > s.marks ? 1 : -1 // now, we sort based on the Student's marks
    }
}

public class ComparableInterface {
    public static void main(String[] args){
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, 55, "Callie"))
        studs.add(new Stud(24, 56, "Midnight"))
        studs.add(new Stud(25, 57, "Lil' Nacheaux"))
        studs.add(new Stud(26, 58, "Gray Cat"))
    }

    Collections.sort(studs); // see the class above... if you want to sort it, or use other collection apis,
    // you must implement the Comparable interface

    // Can also define sort like this:
    Collections.sort(studs(i,j)->i.marks>j.marks); // we use a Lambda b/c Comparator is a functional interface

    for(Stud s:studs){
        System.out.println(s)
    }
}

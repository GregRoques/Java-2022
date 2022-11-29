import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>(); // b/c Set is an Interface, we must find a class that implements it:
                                               // TreeSet
        values.add(5);
        values.add(6);
        values.add(9);
        values.add(6); // this won't be added, as Set -- unlike List -- only supports UNIQUE elements

        for (int i : values) {
            System.out.println(i);
        }
    }
}

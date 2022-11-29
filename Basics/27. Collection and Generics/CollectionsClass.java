import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(9);
        values.add(6);
        values.add(2);

        Collections.sort(values); // will sort the above to 2,4,6,9
        Collections.reverse(values); // will give us 9, 6, 4, 2
        Collections.shuffle(values); // will give us the numbers in a random order

        // List is Mutable... the above values mutate the "values" Object

        for (Integer o : values) {
            System.out.println(o);
        }

    }
}
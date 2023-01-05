import java.util.ArrayList;
import java.util.Arrays;
// ArrayList is part of the Collections Class

public class ArrayList {
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

/*
Array vs. ArrayList

Differences:

1. In Java, array is a basic functionality whereas ArrayList is a part of the collection framework.

2. The array is a fixed sized data structure thus, the array always needs to mention the size of the elements. On the other hand, ArrayList is not a fixed sized data structure, thus there is no need to mention the size of the ArrayList especially creating its object.

3. An array has both primitive data types as well as object data types. However, ArrayList has only object-type data entries and not primitive data types.

Similarities:

1. Both are used to store the data elements as well as null elements
2. Both might have duplicate values, though they are not able to preserve the order of the elements
 */
import java.util.*;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        // lets say we want to sort based on the last number in each 3-digit number
        // to do this, we will need to over-ride the sort function
        // Collections allows us to do this by creating a Comparator and passing it with our array ("values")

        Comparator<Integer> c = new Comparator<Integer>(){

            public int compare(Integer i, Integer j){
                    return i%10>j%10 ? 1 : -1;
            }

        }; // Comparator is an Interface, so we will use it to create an anonymous class

        Collections.sort(values, c); // now, will return 404, 265, 908, 639

        for (Integer o : values) {
            System.out.println(o);
        }
}

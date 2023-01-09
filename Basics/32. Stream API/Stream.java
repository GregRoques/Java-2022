import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream{
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(...a,4,5,7,3,2,6)

        /*
        Consumer<Integer> con = n -> System.out.println(n); // is a lambda
        nums.forEach(con);
        // could also do nums.forEach(n -> System.out.println(n)); without instantiating Consumer
        */

        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n)); // once you use a stream, it cannot be re-run
        Stream<Integer> s3 = s1.filter(n -> n%2===0);
        int result = s3.reduce(0, (c,e) -> c + e);
        System.out.println(result);

        // could also do:

        int shorterResult = nums.stream()
            .filter(n->n%2==0)
            .map(n->n*2)
            .reduce(0, (c,e)->c+e);
        System.out.println(shorterResult);

    }
}
import java.util.*;
import java.util.stream.IntStream;

public class Range {

    public static void main(String[] args){

        // Create an IntStream
        IntStream st = IntStream.range(32, 45);

        System.out.println("The elements are:");
        // Display the elements in the range mentioned as 32 and 45 where 32 is included and 45 is excluded

        st.forEach(System.out::println); // notice System.out::println syntax for loop statement
    }
}

// Syntax:
/*
 
IntStream stream = IntStream.range(int startInclusive, int endExclusive)

- takes 2 parameters: 
    1. startInclusive: The initial value which is included in the range.
    2. endExclusive: The last value or upper bound which is excluded in the range.

- Return Value: This method returns a sequential IntStream of int elements mentioned in the range as parameters.
For Example, the above will return:

```
The elements are:
32
33
34
35
36
37
38
39
40
41
42
43
44
```
- the range is 32 - 45, where 32 is included and 45 is excluded

 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        // remember, the Collection interface DOES NOT support index numbers
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        Iterator it = values.iterator();

        // System.out.println(it.next()); //4
        // System.out.println(it.next()); //6
        // System.out.println(it.next()); //9
        // System.out.println(it.next()); // error

        while(it.hasNext()){
            System.out.println(it.next())
        } // loops until we reach end.
    }
}
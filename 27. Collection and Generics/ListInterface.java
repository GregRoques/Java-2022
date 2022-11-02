import java.util.List;
import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        // List extends Collection
        List values = new ArrayList(); // list is a list of objects unless you use generics
        values.add(4); // on backend, this is equal to: Integer v = new Integer(4)... or, and object of an integer
        values.add(6);
        values.add(9);
        // advantage of list is that we can use an index
        // values.add(index,value)
        values.add(2,2)

        Iterator it = values.iterator();

        for(int i = 0; i <values.size;i++){
            System.out.println(values.get(i))
        }

        for(Object o : values){
            System.out.println(o) // also works, as "List" is an array of Objects
        }
        
    }
}
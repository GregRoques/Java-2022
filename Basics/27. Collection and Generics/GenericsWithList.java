import java.util.List;
import java.util.ArrayList;

public class GenericsWithList {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>(); 
        // can be written "new ArrayList<Integer>();", but does not need to since you already assign Integer as the generic with "List<Integer>"
        values.add(4);
        values.add(6);
        values.add(9);

        int myNum = 0 
        for(Integer o: values)
        {
            myNum += o
        }
        System.out.println(myNum);
       
    }

}

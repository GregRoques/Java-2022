import java.io.BufferedReader;
import java.io.InputStreamReader; // imports ending in io are resources. It is important to close these when finished to preserve memory

// this works too for Exceptions:

// public class CheckedException {
//     public static void main(String[] args) throws Exception {
//         int n = 0;
//         System.out.println("Enter a number");
//         BufferReader br = new BufferReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readline());
//         br.close();

//         System.out.println(n);
//     }

// }

public class CheckedException {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number");

        BufferReader br = null;
        try{
            BufferReader br = new BufferReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readline());
        } catch(IOException | Exception e){
            System.out.println("Error " + e)
        } finally {
            br.close();
        } // finally is a good place to close resources
        
        System.out.println(n);
    }

}

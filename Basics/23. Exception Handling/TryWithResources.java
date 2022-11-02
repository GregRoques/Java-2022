import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class TryWithResources {
//     public static void main(String[] args) throws Exception {
//         int n = 0;
//         System.out.println("Enter a number");

//         BufferReader br = null;
//         try {
//             BufferReader br = new BufferReader(new InputStreamReader(System.in));
//             int n = Integer.parseInt(br.readline());
//         } finally {
//             br.close();
//         } // finally is a good place to close resources

//         System.out.println(n);
//     }
// } // ====================== you can use try without catch to close resource

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        BufferReader br = null;
        try (BufferReader br = new BufferReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readline());
        } // the above syntax will close automatically; this allows us to use try w/out
          // catch or finally

        System.out.println(n);
    }
}
public class CallieCatError extends Exception {
    public CallieCatError(String s) {
        super(s); // passes to Exception's super method;
    }
}

public class UserDefined {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i / j;
            if (k == 0) {
                // throw new Exception();
                throw new CallieCatError("Hissssss!!!!");
            }
            System.out.println(k);
        } catch (CallieCatError | Exception e) {
            System.out.println("Error: " + e.getMessage(););
        }

    }
}

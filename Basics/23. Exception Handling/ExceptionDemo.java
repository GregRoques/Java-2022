public class ExceptionDemo {
    public class ExceptionDemo {
        public static void main(String[] args){
            try{
                int i = 7;
                int j = 0;
                int k = i/j;
                System.out.println("output is " + k);
                // System.out.println("Bye Bye"); // won't print this here, b/c it breaks above

            }catch(ArithmeticException e){
                System.err.println('Error' + e); //notice use of err instead of out
            } finally {
                System.out.println("Bye Bye"); // that's why we put it here
            } // runs whether or not you get exceptions
        }
    }
}

public class Fibonacci {

    private static long[] fibonacciCache; // memoization cache (see ReadMe)

    public static void main(String[] args){
        int n = 92; // 92 appears to be the limit at which "long" generates the highest number it can hold
        //... over that num, and it will start throwing negative numbers for the numbers it cannot hold

        fibonacciCache = new long[n+1];

        //System.out.println(fibonacci(n)); // will print final calculation

        for(int i = 0; i <=n; i++){
            System.out.print(fibonacci(i) + " "); // prints all of our numbers
        }
    }

    private static long fibonacci(int n){
        if(n <= 1){
            return n;
        }

        if(fibonacciCache[n] != 0){
            return fibonacci[n];
        }

        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return ;
    }
}
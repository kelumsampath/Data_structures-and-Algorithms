package T1RecursionAndBackTracking;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int n) {
        // base cases: fact of 0 is 1
        if(n == 0)
            return 1;
            // recursive case: multiply n by (n-1) factorial
        else
            return n*factorial(n-1);
    }
}

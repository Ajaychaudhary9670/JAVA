package recursion;

public class fibnocci {
    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fib(n - 1) + fib(n - 2);
        return fibn;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }

}
 //space complexity O(n)
 // Time complexity O(n^2)
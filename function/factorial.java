package function;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        // System.out.println(factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // int factorial = 1;
        // if (n >= 0) {
        // for (int i = n; i > 1; i--) {
        // factorial = factorial * i;
        // }
        // System.out.println("factorial of given number is :" + factorial);
        // } else {
        // System.out.println("factorial of negative number is not define");
        // }

        int result = fact(n);
        System.out.println(result);
        sc.close();
    }
}

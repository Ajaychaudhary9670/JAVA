package function;

import java.util.Scanner;

public class primeInRange {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
        // if (isPrime == false) {
        // System.out.println("enter number is not prime");
        // } else {
        // System.out.println("enter number is prime");
        // }
        // return isPrime;
    }

    public static void Primenumbers(int k, int m) {
        for (int i = k; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        Primenumbers(k,m);

        sc.close();
    }

}

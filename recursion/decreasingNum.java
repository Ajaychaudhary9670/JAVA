package recursion;

import java.util.Scanner;

public class decreasingNum {
    public static int dec(int n) {
        if (n == 1) {

            return 1;
        }
        System.out.println(n);
        return dec(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(dec(10));
        sc.close();
    }

}

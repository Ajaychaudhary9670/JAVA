package function;

import java.util.Scanner;

public class binomialcofficent {
    public static int fact(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int bio(int m,int r) {
        int fact_m = fact(m);
        int fact_r = fact(r);
        int fact_mmr = fact((m-r));  //factororial  of m-r
        int result = fact_m/(fact_r * fact_mmr);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the value of m:");
        int m = sc.nextInt();
        System.out.println("enter the value of r:");
        int r = sc.nextInt();
        int result = bio(m, r);
        System.out.println(result);
        

        sc.close();
    }

}

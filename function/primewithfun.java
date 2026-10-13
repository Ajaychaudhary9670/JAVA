package function;

import java.util.Scanner;
public class primewithfun {
    public static  boolean prime(int n){
     boolean isPrime = true;
     for(int i = 2; i<n-1;i++){
        if(n%i==0){
            isPrime = false;
        }
     }
     return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // boolean isPrime = true;
        int n  = sc.nextInt();
        boolean isPrime = prime(n);
        if(isPrime == false){
            System.out.println("number is not prime");
        }else{
            System.out.println("number is prime");
        }

        sc.close();

    }
    
}

package revision;

import java.util.Scanner;

public class recusion {
    public static void printNumber(int n){
       if(n==0){
        return;
       }
        printNumber(n-1);          //Increasing order
       System.out.print(n + " ");
    //    printNumber(n-1);        //Decreasing order

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:  ");
        int n = sc.nextInt();
        printNumber(n);
        sc.close();
        
    }
}

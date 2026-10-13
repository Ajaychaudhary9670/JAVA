package ImportantQuestion;

import java.util.Scanner;

public class arrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 21, 45, 24, 211, 76, 53 };
        int arr1[] = { 100, 32, 44, 55, 66, 88 };
        int n= arr.length+arr1.length;
         int arr2[]=new int [n];
         for(int i =0;i<n;i++){
            arr2[i] = arr1[i]+arr[i];
            System.out.println(arr2[i]);
         }
        sc.close();

    }

}

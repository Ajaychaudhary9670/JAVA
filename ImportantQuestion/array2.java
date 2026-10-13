package ImportantQuestion;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 22, 4, -3,31, 67, 35, 8,500, 67, 100 };
        // int n = Integer.MAX_VALUE;
        int n = Integer.MIN_VALUE;
        int i;
        
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }

        }
        int m = Integer.MIN_VALUE;
        // int m = Integer.MAX_VALUE;
         for (i = 0; i < arr.length; i++) {
            if (arr[i] > m && arr[i]!=n) {
                m = arr[i];
            }

        }
        System.out.println(n);
        System.out.println(m);
        sc.close();
    }

}

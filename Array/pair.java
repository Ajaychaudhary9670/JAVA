 import java.util.*;
public class pair {
    public static void printPairs(int arr[]) {
       
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                // System.out.print("(" + curr + "," + arr[j] + ") ");
                // System.out.println("(" + curr + "," + arr[j] + ")");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         System.out.println("enter size of Array : ");
         int n = sc.nextInt();
         int arr[] = new int[n];

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("enter the element in array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        
        printPairs(arr);

    }

}

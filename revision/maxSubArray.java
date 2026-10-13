package revision;

import java.util.Scanner;

public class maxSubArray {
    public static void reverse(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                if ((arr[i] + arr[j]) > max) {
                    max = arr[i] + arr[j];
                }

            }
            System.out.println(" ");
        }
        System.out.println("maximum sub array is : " + max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 5, 7, 9, 8 };

        reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }

}

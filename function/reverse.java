package function;

import java.util.Scanner;

public class reverse {
    public static void rev(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23, 45, 67, 89, 90, 75, 42, 13 };
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

}

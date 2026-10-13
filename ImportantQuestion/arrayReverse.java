package ImportantQuestion;

import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 21, 32, 12, 4, 56, 7, 85 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.print("reverse array are : ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }

}

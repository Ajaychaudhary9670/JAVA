import java.util.*;

public class split {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 2, 5, 6, 8, 23, 34, 11, 12 };
        int arr1[] = new int[arr.length];

        int start = 0;
        int end = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                end = i;
                
            }

            if (arr[i] < min) {
                min = arr[i];
                start = i;
            }
        }

        int j = 0;

        for (int i = start; i <= end; i++) {
            arr1[j] = arr[i];
            j++;
        }

        for (int i = 0; i < start; i++) {
            arr1[j] = arr[i];
            j++;
        }

        for (int i = end + 1; i < arr.length; i++) {
            arr1[j] = arr[i];
            j++;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
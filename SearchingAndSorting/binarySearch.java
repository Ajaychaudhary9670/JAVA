package SearchingAndSorting;

import java.util.Scanner;

public class binarySearch {
    public static void Search(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                System.out.println("element is found at indix :" + mid);
                return;
            }
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("element is not present in the array");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 3, 4, 45, 6, 7, 8, 9, 10, 11 };
        System.out.println("enter the element to be search:  ");
        int x = sc.nextInt();
        Search(arr, x);

        sc.close();
    }

}

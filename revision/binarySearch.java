package revision;

import java.util.Scanner;

public class binarySearch {
    public static void Binary(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                System.out.println("element is found  at indix::"+mid);
            }
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println("element is not fount in this array ");

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = { 12, 22, 3, 334, 45, 667, 8, 9, 6, 4, 2, 5, 8, 7 };
        System.out.println("enter the element to be search");
        int x = Sc.nextInt();
        Binary(arr, x);

    }

}

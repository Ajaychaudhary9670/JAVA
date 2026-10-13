package Leetcode;

public class prob45 {
    public static int SearchInsert(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return (start);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8, 9 };
        System.out.println(SearchInsert(arr, 10));

    }
}

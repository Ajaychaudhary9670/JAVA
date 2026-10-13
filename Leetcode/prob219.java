package Leetcode;

public class prob219 {
    public static boolean linearsearch(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length ; j++) {
                if (curr == arr[j]) {
                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 1, 8, 11, 22, 34 };
        System.out.println(linearsearch(arr, 2));

    }

}

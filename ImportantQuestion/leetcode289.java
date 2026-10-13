package ImportantQuestion;

public class leetcode289 {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 3, 6, 0, 8, 0, 5, 1, 0 };
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {         
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class reversearry {
    public static int[] ReverseArray(int arr[]) {
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // start++;
        // end--;
        // }
        int j = 0;
        int arr2[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }

        return arr2;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 12, 32, 45 };
        int result[] = ReverseArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}

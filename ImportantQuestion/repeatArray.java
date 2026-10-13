package ImportantQuestion;

public class repeatArray {
    public static int[] cancatenatin(int arr[]) {
        int n = arr.length;
        int i;
        int arr1[] = new int[2 * n];
        for (i = 0; i < n; i++) {
            arr1[i] = arr[i];

        }
        for (i = 0; i < arr.length; i++) {
            arr1[i + arr.length] = arr[i];

        }
        return arr1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6 };
         int result [] = cancatenatin(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }

    }

}

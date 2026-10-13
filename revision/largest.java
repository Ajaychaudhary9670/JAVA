package revision;

public class largest {
    public static int l(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 6, 8, 9, 10 };
        System.out.println("largest elements among alll element  " + l(arr));
    }

}

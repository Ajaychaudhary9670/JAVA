public class maxsubArray {
    public static void Print(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                }
                if (sum > max) {
                    max = sum;
                }
                System.out.println("  sum:" + sum);

            }
            System.out.println();

        }
        System.out.println("maximum subarray =" + max);
    }

    public static void main(String[] args) {

        int arr[] = { 11, 1, 12, 13, 14, 32, 42, 50 };
        Print(arr);

    }

}
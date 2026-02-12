public class subArray {
    public static void sub(int arr[]) {
        int sum = 0;
        int maxnum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(arr[k]);
                    sum = sum + arr[k];
                    // System.out.print(sum);
                }
                System.out.print(sum +" ");
                if (sum > maxnum) {
                    maxnum = sum;

                }

                // System.out.println();

            }
            System.out.println();

        }

        System.out.print("maximun sum of sub array is : " + maxnum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        sub(arr);

    }

}

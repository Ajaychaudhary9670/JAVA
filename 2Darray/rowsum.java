import java.util.Scanner;

public class rowsum {
    public static int rowSum(int arr[][]) {
        int MAX = Integer.MIN_VALUE;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int R1sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > MAX) {
                    MAX = arr[i][j];

                }
                System.out.print(arr[i][j] + " ");
                R1sum += arr[i][j];

            }
            System.out.println();

            if (R1sum > maxSum) {
                maxSum = R1sum;
            }
        }
        System.out.println("largest element of matrix is = " + MAX);

        return maxSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("enter elements of an array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(rowSum(arr));

        sc.close();

    }

}

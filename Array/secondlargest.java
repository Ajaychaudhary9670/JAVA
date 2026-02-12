import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23, 2245, 35, 322124, 875, 56, -2 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        int tmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tmax && arr[i] != max && arr[i] != smax) {
                tmax = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
        sc.close();

    }
}

import java.util.*;

public class countfrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != count) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of an array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("elements of an arry");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

            sum = sum + arr[i];

        }
        System.out.println("  ");
        System.out.println(sum);
        sc.close();
    }
}

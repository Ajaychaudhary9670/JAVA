import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elementsmof an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter elements to find greater:");
        int count = 0;
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 12, 3, 45, 6, 34, 87 };
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]<max)
          {
            max=arr[i];
          }
        }
        System.out.println(max);
        sc.close();
    }
}

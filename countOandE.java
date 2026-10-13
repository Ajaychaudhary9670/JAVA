import java.util.*;

public class countOandE {

    public static void count(int arr[]) {
        int Ocount = 0;
        int Ecount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Ecount++;
            } else {
                Ocount++;

            }
        }
        if (Ecount > Ocount) {
            System.out.println("even number is greater");
        } else if (Ecount < Ocount) {
            System.out.println("odd number is greater:");
        } else if (Ecount == Ocount) {
            System.out.println("even and odd aa equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter marks:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        count(arr);

    }

}

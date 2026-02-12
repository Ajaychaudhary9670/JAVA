import java.util.Scanner;

public class elementsearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements  of an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter elemente to search:");
        int x = sc.nextInt();
       boolean flage=false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
               flage=true;
               break;                                 //  System.out.println("mil gya");

            }

        }
        if (flage==false)
        System.out.println("nhi mila");
        else 
        System.out.println("mil gya");

        sc.close();
    }
}

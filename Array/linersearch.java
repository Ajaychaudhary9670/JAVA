import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be search ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("enement " +""+ x+" " + "is found at index"+" " + i);
           
            
        }
    }

        sc.close();
    }

}

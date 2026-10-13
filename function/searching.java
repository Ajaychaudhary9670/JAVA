package function;

import java.util.Scanner;

public class searching {
    public static int search( int arr[],int x){
     for(int i =0;i<arr.length;i++){
        if(arr[i]==x){
            return  i;
        }
        
     }
     return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("enter te element of an arry:");
        
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be search:");
        int x = sc.nextInt();
        int result  = search(arr, x);
        if(result == -1){
            System.out.println("element is not found:");
        }else{
            System.out.println("element is found at index" + " "+ result );
        }

        sc.close();
    }

}

package revision;

import java.util.Scanner;

public class linearSearch {
    public static void Search(int arr[],int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("element is found at index::"+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int arr[] = {1,22,33,42,323,4,567,11,44};
        System.out.println("enter the element to be search::");
        int x =sc.nextInt();
        Search(arr,x);


    }
    
}

import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={23,2245,35,322124,875,56,-2};
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            {
              max=arr[i];
            }
           
        }
        System.out.println(max);
         
        sc.close();
    }
}

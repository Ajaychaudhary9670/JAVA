package revision;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[6];
        System.out.println("enter the array: ");
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array is : ");
        for(int i=0;i<6;i++){
            // if(i<=4){
            //     sum = sum+arr[i];
            // }
            System.out.print(arr[i]+" ");
        }
        System.out.println("sum of first 5 student is: ");
        System.out.println(sum);
    }
}

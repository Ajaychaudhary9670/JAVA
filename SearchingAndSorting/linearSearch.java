package SearchingAndSorting;
import java.util.Scanner;;

public class linearSearch {
    public static void Search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("element is found at indix:"+i);
                return;
            }
        }
        System.out.println("element is not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {11,2,334,4,5,12,33,44,55};
        System.out.println("enter the element to be search: ");
        int x= sc.nextInt();
        Search(arr, x);


    }
    
}

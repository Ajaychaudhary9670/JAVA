import java.util.Scanner;

public class missingElements {
    public static void missing(int arr[]){
        for(int i=1;i<=arr.length;i++){
            boolean isFound = false;
            for(int j =0;j<arr.length;j++){
                if(arr[j]==i){
                    isFound = true;
                    break;
                }
            }
            if(isFound==false){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,2,3,4,5,8,9,10,11,12};
        missing(arr);
        sc.close();
    }
}

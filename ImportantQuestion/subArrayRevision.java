package ImportantQuestion;

import java.util.Scanner;

public class subArrayRevision {
    public static void sub(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = 1+i;j<arr.length;j++){
                int sum = curr+arr[j];
                System.out.print("("+ curr + "," + arr[j]+"=" +sum+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,1,5,7,9};
        sub(arr);
        sc.close();
    }
}

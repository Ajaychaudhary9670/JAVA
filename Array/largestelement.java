import java.util.Scanner;

public class largestelement {
    public static void largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
            }
        }
        System.out.println(max +"= largest");
        System.out.println(secondMax + "= second largest");
        System.out.println(min+ "= smallest number");
        System.out.println(secondMin+"= second smallest number");
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23, 22, 35, 32, 875, 56, -2, -10, -30, 0 };
        // int max=arr[0];
        // for(int i =0;i<arr.length;i++){
        // if(arr[i]>max)
        // {
        // max=arr[i];
        // }

        // }
        // System.out.println(max);

        // sc.close();
      largest(arr);
    }
}

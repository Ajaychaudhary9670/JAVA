package basic.Array;
public class argumentpassing {
    public static void updatearr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,45,67,};
        updatearr(arr);
        for(int i=0;i<arr.length ;i++){
           System.out.print(arr[i] +" ");                                     // System.out.println(arr[i]);
        }
 
    }
    
}

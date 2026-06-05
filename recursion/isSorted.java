package recursion;

public class isSorted {
    public static boolean Sorted(int arr[] ,int i ){
        boolean isSorted = false;
      
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sorted(arr,i+1);

    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,22,6,7,8,9};
        System.out.println(Sorted(arr,0));
       
    }
}

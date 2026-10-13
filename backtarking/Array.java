package backtarking;

public class Array {

  public static void changearray(int arr[],int i,int value){
    if(i==arr.length){    /// base case
         printarray(arr);
         return;
    }

        arr[i] = value;
        changearray(arr, i+1, value+1);   /// uper ja rhe hai to value and index ko update kar rhe hai
        arr[i] = arr[i]-2;    ///  backtacking
    
  }


    public static void printarray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] =new int[5];
        changearray(arr, 0, 1);
        printarray(arr);
        
    }
    
}

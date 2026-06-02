package SearchingAndSorting;

public class bubbleSort {
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){   ////  number of turn
            for(int j=0;j<arr.length-1-i;j++){  //// inner loop for comparision and swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,33,45,61,11,12,13,14,121,55,44,33443,4,25};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}

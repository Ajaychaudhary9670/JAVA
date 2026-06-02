package SearchingAndSorting;

public class selectionSort {
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j])    //// sorted in decreasing order
                minPos=j;                  ////> sorted in increasing order
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,12,11,10,9,6,4,96,75,45,34,313,5,23,78};
        Sort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

    }
}

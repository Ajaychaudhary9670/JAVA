package SearchingAndSorting;

public class insertionSort {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
          
            // Insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {22,1,2,3,42,8,6,4,23,43,55,64,21,24};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}

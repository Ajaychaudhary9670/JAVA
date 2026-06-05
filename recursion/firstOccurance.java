package recursion;

public class firstOccurance {
    public static int Occurance(int arr[],int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Occurance(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,410,22,1,1,3,4,5,2,5,2,1,3,2};
        System.out.println(Occurance(arr, 0, 2));
    }
} 




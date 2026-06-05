package recursion;

import revision.recusion;

public class lastOccurance {
    public static int LastOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int result = LastOcc(arr, i+1, key);
        if(result==-1&& arr[i]==key){
            return i;
        }
        return result;
    }
    public static void main(String[] args) {
           int arr[] = {1,3,5,7,9,410,22,1,1,3,4,5,2,5,2,1,3,2};
           System.out.println(LastOcc(arr, 0, 1));
    }
}

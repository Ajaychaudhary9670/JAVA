package ImportantQuestion;

public class leetcode1470 {
    public static int[] suffle(int arr[]) {
        int arr1[] = new int[arr.length];
        int k =0;
        for (int i = 0; i < arr.length/2; i++) {
             arr1[k] = arr[i];
             k++;
             arr1[k]= arr[i+arr.length/2];
             k++;
            }
        
        return arr1;
    }

    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int result[] = suffle(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}

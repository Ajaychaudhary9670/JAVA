public class makeNewArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 3, 6, 6, 7 };
        int arr1[] = { 1, 3, 4, 6, 3, 6, 6, 7 };

        for (int i = 0; i <= arr1.length; i++) {
            arr[i + arr.length+1] = arr1[i];

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(arr.length);

    }
}

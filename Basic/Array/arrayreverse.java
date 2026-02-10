// public class arrayreverse {
//     public static void main(String[] args) {
//         int arr[] = { 12, 23, 45, 56, 77, 21, 87, 56, 90 };
//         int rev[] = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {

//             rev[i] = arr[arr.length-1-i];

//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(rev[i] +" ");

//         }
//         System.out.println();
//          System.out.println(arr.length);
//     }

// }

//aray reverse with out using second arry using funcrtion 

public class arrayreverse {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 12, 23, 45, 56, 77, 21, 87, 56, 90 };
        // int reverse[] = new int[arr.length];
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

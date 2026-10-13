// package function;

// public class maxterm {
//     public static int max(int arr[]){
//         int max = Integer.MIN_VALUE;

//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];

//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//       int arr[] = {1,2,3,4,5, 100,6,7,8,9};
//       System.out.println(max(arr));

//     }
    
// }/

///  min term
package function;

public class maxterm {
    public static int min(int arr[]){
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){                  // >
                min = arr[i];

            }
        }
        int smin = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smin && arr[i]!=min){
                smin  = arr[i];
            }
        }
        return smin;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5, 100,6,7,8,9};
      System.out.println(min(arr));

    }
    
}

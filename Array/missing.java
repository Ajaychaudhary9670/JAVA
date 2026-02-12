public class missing {

   public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,5,9,10,11,7,13};
        int sum = 0;
        int n = arr.length+1;
        int total = n*(n+1)/2;
        // int arr1[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];

        }
       System.out.println(total-sum);
    }
    
}
//   is se kewal ek elements missing find kar sakte hai....
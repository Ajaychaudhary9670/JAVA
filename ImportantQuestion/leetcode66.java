package ImportantQuestion;

public class leetcode66 {
    public static int[] Addlastdigit(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= 8) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int ans[] =new int[arr.length+1];
        ans[0]=1;
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 2,9,9,9};
        
        Addlastdigit(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
       }

    }

}
// yese kaam kaam karta hai


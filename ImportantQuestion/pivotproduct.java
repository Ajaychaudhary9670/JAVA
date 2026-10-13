package ImportantQuestion;

public class pivotproduct {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            ans[i] = product;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}

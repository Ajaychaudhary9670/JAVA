package ImportantQuestion;

public class pivotelement {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int sum = 0;
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int rightsum = sum - leftsum - arr[i];
            if (leftsum == rightsum) {
                System.out.println(i);
            } else {
                leftsum +=arr[i];
            }
        }
    }

}

public class sumelement {
    public static void sumelements(int arr[]) {
        int sum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
           
        }
        System.out.println(sum);
       System.out.println((double)sum/arr.length);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 2, 4, 5, 6, 7 };
        sumelements(arr);
    }

}

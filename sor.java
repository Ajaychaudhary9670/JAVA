import java.util.Arrays;

public class sor {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 6, 3, 8, 10, 7};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
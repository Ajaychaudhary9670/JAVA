package recursion;

public class sum {
    public static int natural(int n) {
        if (n == 1) {
            return 1;

        }
        int sum = natural(n-1);
        int result = sum + n ;
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(natural(n));
    }

}

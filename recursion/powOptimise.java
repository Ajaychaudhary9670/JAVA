package recursion;

public class powOptimise {
    public static double optimise(int x, int n) {
        if (n == 0) {
            return 1;
        }
        double halfpower = optimise(x, n / 2);
        double halfpowerSquer = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfpowerSquer = x * halfpowerSquer;
        }
        return halfpowerSquer;
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 2;
        System.out.println(optimise(x, n));

    }

}

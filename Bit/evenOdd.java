public class evenOdd {
    public static void EvenOdd(int n) {
        int bitMash = 1;
        if ((n & bitMash) == 0) {
            System.out.println(n + " is even number");

        } else {
            System.out.println(n + " is not a even number");
        }
    }

    public static void main(String[] args) {
        EvenOdd(10);
        EvenOdd(3);
        EvenOdd(15);
        EvenOdd(16);

    }

}


public class updateIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMash = ~(1 << i);
        return n & bitMash;
    }

    // public static int setIthbit(int n, int i) {
    //     int bitMash = i << 1;
    //     return bitMash | n;
    // }

    public static int upDateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthbit(n, i);
        // }

        n=clearIthBit(n, i);
        int bitMash = newBit<<i;
        return n| bitMash;

    }

    public static void main(String[] args) {
        System.out.println(upDateIthBit(10, 2, 1));

    }
}

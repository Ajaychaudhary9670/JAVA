public class count1inNum {
    public static int countone(int n) {
        int count = 0;
        int bitMash = 1 << 0;
        while (n >0) {
            if ((n&1)!= 0) {
                count++;
            }
             n = n>>1;

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countone(15));

    }
}

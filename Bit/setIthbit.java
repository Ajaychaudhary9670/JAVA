public class setIthbit {
    public static int setIthBit(int n,int i){
        int bitMash = 1<<i;
        return n|bitMash;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(9, 2));
        
    }
}

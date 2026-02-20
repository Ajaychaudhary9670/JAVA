public class clearLastIthBit {
    public static int ClearLastIthBit(int n ,int i){
        int bitMash = (-1)<<i;
        return bitMash & n;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIthBit(15, 2));
        
    }
}

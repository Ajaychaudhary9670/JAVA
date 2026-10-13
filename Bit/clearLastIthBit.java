public class clearLastIthBit {
    public static int ClearLastIthBit(int n ,int i){
        int bitMash = (-1)<<i;
        return bitMash & n;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIthBit(15, 2));
        
    }
}



/// 1111 ,i=2 diya hai to 1100 aisa answer aana chahiye 
/// logic -1=~0=111111111
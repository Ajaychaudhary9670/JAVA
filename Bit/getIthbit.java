public class getIthbit {
    public static void getIthBit(int n ,int i){
        
        int bitMash = 1<<i;
        if((n & bitMash)==0){
            System.out.println("ith bit is a = 0");
        }else{
            System.out.println("ith bit is = 1");
        }
        
    }

    public static void main(String[] args) {

        getIthBit(9, 2);
        getIthBit(5, 0);
        

        getIthBit(8, 3);     ///counting of bit from 0
        

    }
}

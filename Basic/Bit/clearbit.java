package bit;

public class clearbit {
    public static int clearbit(int n,int i){
        int bitMash = ~ (1<<i);
        return n & bitMash;
    }
   public static void main(String[] args) {
    System.out.println(clearbit(10, 1));
    
   }

    }
    


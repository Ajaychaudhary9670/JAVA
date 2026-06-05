package recursion;

public class pair {
    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = pairing(n-1);
        int pair = pairing(n-2) * (n-1);
        return (single+pair);

        // return (pairing(n-1)+ (n-1)*pairing(n-2));
    }
    public static void main(String[] args) {
        System.out.println(pairing(10));
         
    }
}

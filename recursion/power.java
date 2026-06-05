package recursion;

public class power {
    public static int  pow(int x,int n){
        if(n==0){
            return 1;
        }
        int result = x*pow(x,n-1);
        return result;
    }
    public static void main(String[] args) {
        int x= 3;
        int n = 3;
        System.out.println(pow(x, n));
    }
    
}

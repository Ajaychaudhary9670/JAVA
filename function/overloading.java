package function;

public class overloading {
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
      public static float sum(float a , float b){
        float sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,8));
        System.out.println(sum(4.5f,2.3f));
    }
    
}

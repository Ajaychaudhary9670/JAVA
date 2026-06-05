package recursion;

public class printbinstring {
    public static void binary(int n , int lastplace,String str){
        
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastplace==0){
        //     binary(n-1, 1, str +"1");
        //     binary(n-1, 0, str+"0");
        // }else{
        //     binary(n-1, 0, str +"0");
        // }

      binary(n-1, 0, str +"0");
      if(lastplace==0){
        binary(n-1, 1, str +"1");
      }




    }
    public static void main(String[] args) {
        binary(3, 0, "" );
        
    }
    
}

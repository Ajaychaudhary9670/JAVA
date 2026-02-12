package String;

public class fNonReapChar {
    
    public static void main(String[] args) {
        String str = "leetcode";
        int index =0;
        for(int i =0 ;i<str.length()-1;i++){
            for(int j =1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                  index = i;
                 
                  
                }
            }
        }
        System.out.println(index);
    }
    
}

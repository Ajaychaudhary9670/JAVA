package recursion;

public class remove {
    public static void notdublicats(String str,int idx,StringBuilder newstr, boolean map[]){

        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        
        ///  kaam 
        char currChar = str.charAt(idx);
        if(map[currChar -'a']==true){
            // dublicate
            notdublicats(str, idx+1, newstr, map);
        }else{
            map[currChar -'a']=true;
            notdublicats(str, idx, newstr.append(currChar), map);


        }


    }
    public static void main(String[] args) {
        notdublicats("ajaychaudhary", 0, new StringBuilder(""), new boolean[26]);
         
    }
    
}

package Stack;

import java.util.*;



public class reverse {
    public static String rev(Stack<Character> s,String str){
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
            
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abc";
        String result = rev(s, str);
        System.out.println(result);

    }

}

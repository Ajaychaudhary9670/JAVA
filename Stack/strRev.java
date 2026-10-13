package Stack;

import java.util.*;

public class strRev {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("a");
        s.push("b");
        s.push("c");
        String name = "";

        while (!s.isEmpty()) {
            s.peek();
            name = name + s.pop();
        }
        System.out.println(name);
    }

}


//////  NOT A BEST METHOD 
//  EK AUR PROGRAM HOGA REVERSE NAAM KA OO BEST HAI..

package Stack;

import java.util.Stack;

import String.character;
import revision.string;

public class reverseNumber {
    public static String reverse(Stack<Character> s, String num) {
        int idx = 0;
        while (idx < num.length()) {
            s.push(num.charAt(idx));
            idx++;

        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {

            char curr = s.pop();
            sb.append(curr);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String num = "1234567";
        String result = reverse(s, num);
        System.out.println(result +" ");

    }
}









// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         int num = 12345;
//         Stack<Integer> stack = new Stack<>();

//         // Push digits into stack
//         while (num > 0) {
//             int digit = num % 10;
//             stack.push(digit);
//             num = num / 10;
//         }

//         // Pop digits to form reverse
//         int reverse = 0;

//         while (!stack.isEmpty()) {
//             reverse = reverse * 10 + stack.pop();
//         }

//         System.out.println("Reverse = " + reverse);
//     }
// }
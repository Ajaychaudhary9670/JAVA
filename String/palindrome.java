package String;

public class palindrome {
    public static boolean pali(String str) {
       
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i-1)) {
              return false; 
            }
        }
        return true;
    }
                            // boolean return type hota hai 
    public static void main(String[] args) {
        String str = "racecar";
       System.out.println(pali(str));

    }

}


// class Solution {
//     public boolean isPalindrome(String s) {

//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {

//             // Left se space/special character skip karo
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }

//             // Right se space/special character skip karo
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             // Dono characters ko lowercase karke compare karo
//             if (Character.toLowerCase(s.charAt(left)) !=
//                 Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }

//             // Next characters par jao
//             left++;
//             right--;
//         }

//         return true;
//     }
// }

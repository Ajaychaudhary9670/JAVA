
package revision;

import Stack.stackSpan;
import String.stringBuilder;

public class sixjune {
    public static boolean check(String str) {
        int start = 0, end = str.length() - 1;
        boolean isPalindrom = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {

            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    public static int firstUniqueChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean anagram(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            count[str1.charAt(i)]--;

        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void frequencyCount(String str) {
        int count[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + "=" + count[i]);
            }
        }

    }
     public static void longestPrefix(String str[]){
        String LongPref = str[0];
        for(int i=1;i<str.length;i++){
            

        }


     }

     
   
    

    public static void main(String[] args) {
        // String str = "listen";
        // String str1 = "silent";
        // System.out.println(anagram(str, str1));
        // frequencyCount(str);
        // String str = "bananan";
        // String str1 = "ban";

        String str[] ={"flower","flow","fight"};
       
    }
}
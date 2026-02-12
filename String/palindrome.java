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

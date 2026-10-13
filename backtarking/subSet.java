package backtarking;

public class subSet {
    public static void subsets(String str, int i, String ans) {

        if (i == str.length()) {          //// base case
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        subsets(str, i + 1, ans + str.charAt(i));    // agar choice  yes hota hai to
        subsets(str, i + 1, ans);                     ///  agar choice nhi leta hai to  
    }

    public static void main(String[] args) {
        subsets("abc", 0, "");

    }

}

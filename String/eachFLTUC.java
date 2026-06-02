package String;

public class eachFLTUC {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i< str.length() - 1) {  // space check karna aur last me ek character to hona hi chaiye
                sb.append(str.charAt(i));  //space append karna
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));  //space ke baad first letter ko capital karna
            } else {
                sb.append(str.charAt(i));  //nhi to kuch bhi aaye add kardo
            }
        }
        return sb.toString(); //string me convert kar ke return kar dena
    }

    public static void main(String[] args) {
        String str = "my name is ajay chaudhary how are you";
        System.out.println(touppercase(str));
    }
}

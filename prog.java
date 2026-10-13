import java.util.*;

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isExit = false;

        for (int i = 0; i <= str.length()-1; i++) {
            if ((str.charAt(i) == '#') &&(str.charAt(i+1) == '&') ){
                
                    isExit = true;
                    break;
            }
        }
        if (isExit == true) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }

    }

}

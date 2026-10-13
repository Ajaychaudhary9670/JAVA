package ImportantQuestion;

import java.util.Scanner;

public class againrevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String button = sc.nextLine();
        switch (button) {
            case "a" : System.out.println("my name ajay chaudahry");
            break;
            case "b" : System.out.println("i am very in trovert");
            break;
            default:System.out.println("invalid button");
           
        }
        

        sc.close();

    }

}

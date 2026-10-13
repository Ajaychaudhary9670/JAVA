package revision;

import java.util.Scanner;

import String.character;

public class string {
    public static int Search(String str, char str1) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string what we want to be written");
        String str = sc.nextLine();
        System.out.println("enter the alphabet to be search:: ");
        char ch = sc.next().charAt(0);

        int result = (Search(str, ch));
        if (result > 0) {
            System.out.println("element is found:" + result + "time");
        }

        sc.close();
    }
}

package String;

import java.util.Scanner;

public class contains {
    public static boolean containFunction(String str, String str1) {
        boolean ispresent = false;
        if (str.contains(str1)) {
            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String::  ");
        String str = sc.nextLine();
        System.out.println(("enter the wort to be search::"));
        String str1 = sc.nextLine();
        System.out.println(containFunction(str, str1));

        sc.close();

    }
}

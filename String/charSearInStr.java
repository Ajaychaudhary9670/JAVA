package String;
import java.util.Scanner;

public class charSearInStr {
    public static void rev(String name,char cha){
        boolean found = false;
        int count = 0;
       for( int i =0;i<name.length();i++){
        if(cha == name.charAt(i)){
            count +=1;
            found = true;
       
       }
    }
    if(found==true)
        System.out.println("character is found " + count + "time "+ " ");
    else{
        System.out.println("character is not found ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.nextLine();
        System.out.println("enter character to be searched");
        char cha = sc.next().charAt(0);
        rev(name, cha);
        sc.close();
    }

    
}

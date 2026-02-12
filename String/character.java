package String;

import java.util.Scanner;

public class character {
    public static void elements(String name){
        int count = 0;
        for(int i =0;i<name.length();i++){
            if(name.charAt(i) =='a')
                count +=1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    String str1 = "ajay";
    //    String str2 = "chaudhary";
    //    String result = str1+ " " + str2;
    //    System.out.println(result);
          String name ;
          name= sc.nextLine();
          elements(name);
        //   System.out.println(name);
       sc.close();


    }

}

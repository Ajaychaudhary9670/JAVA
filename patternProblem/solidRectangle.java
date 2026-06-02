package patternProblem;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row: ");
        int r = sc.nextInt();
        System.out.println("enter the number of colum: ");
        int c = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<=c;j++){
                System.out.print("* ");

            }
            System.out.println(" ");

        }
        sc.close();

    }
    
}

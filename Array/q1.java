import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        System.out.println("enter marrks of students: ");
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (marks[i] < 35) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}

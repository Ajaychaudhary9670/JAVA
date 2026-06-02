import java.util.Scanner;

public class syntex {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of an arry");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
    }

}

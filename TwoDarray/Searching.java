
package TwoDarray;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter the element to be search: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("element is found at indix" + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("element is not found ");
        sc.close();

    }

}

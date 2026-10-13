package companyProblem;

public class diagonalSum {
    public static int sumOfDiagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // primary diagonal sum
            sum += matrix[i][i];

            // secondary diagonal sum
            if (i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];

        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };

        System.out.println(sumOfDiagonal(matrix));
    }

}

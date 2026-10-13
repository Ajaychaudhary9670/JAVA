package companyProblem;

public class spiral {
    public static void SpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRor = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRor && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRor; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRor) {
                    break;
                }
                System.out.print(matrix[endRor][j] + " ");
            }

            // left
            for (int i = endRor - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRor--;
            endCol--;

        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };

        SpiralMatrix(matrix);

    }

}

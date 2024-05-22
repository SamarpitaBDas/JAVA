import java.util.Scanner;

public class ps5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        getMatrixElements(matrix, rows, columns, scanner);
        int[][] transposeMatrix = findTranspose(matrix, rows, columns);
        System.out.println("Original Matrix:");
        displayMatrix(matrix, rows, columns);
        System.out.println("Transpose Matrix:");
        displayMatrix(transposeMatrix, columns, rows);
        scanner.close();
    }

    private static void getMatrixElements(int[][] matrix, int rows, int columns, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] findTranspose(int[][] matrix, int rows, int columns) {
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    private static void displayMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

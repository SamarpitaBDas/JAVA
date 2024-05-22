import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrices: ");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        System.out.println("Enter elements for the first matrix:");
        getMatrixElements(matrix1, size, scanner);
        System.out.println("Enter elements for the second matrix:");
        getMatrixElements(matrix2, size, scanner);
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2, size);
        System.out.println("Resultant Matrix after multiplication:");
        displayMatrix(resultMatrix, size);
        scanner.close();
    }
    private static void getMatrixElements(int[][] matrix, int size, Scanner scanner) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int size) {
        int[][] resultMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }
    private static void displayMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

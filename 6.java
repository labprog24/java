import java.util.Scanner;

public class MatrixMultiplication {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = scanner.nextInt();
        
        System.out.println("Enter the number of columns for the first matrix:");
        int cols1 = scanner.nextInt();
        
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        readMatrix(scanner, matrix1);
        
        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = scanner.nextInt();
        
        System.out.println("Enter the number of columns for the second matrix:");
        int cols2 = scanner.nextInt();
        
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        readMatrix(scanner, matrix2);
        
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        if (result != null) {
            System.out.println("Result of matrix multiplication:");
            displayMatrix(result);
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }
        
        scanner.close();
    }
    
    public static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        if (cols1 != rows2) {
            return null; // Matrix multiplication not possible
        }
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

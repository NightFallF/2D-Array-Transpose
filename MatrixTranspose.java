import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = get.nextInt();
        System.out.print("\nEnter the number of Columns: ");
        int cols = get.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("\nEnter the Elements of the Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = get.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

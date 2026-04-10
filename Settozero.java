import java.util.Scanner;

public class Settozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int[][] a = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Step 1: Mark rows and columns
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if (a[i][j] == 0) {
                    markRow(a, i, col1);
                    markCol(a, j, row1);
                }
            }
        }

        // Step 2: Convert -1 to 0
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if (a[i][j] == -1) {
                    a[i][j] = 0;
                }
            }
        }

        // Print result
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mark entire row
    private static void markRow(int[][] a, int row, int colCount) {
        for (int j = 0; j < colCount; j++) {
            if (a[row][j] != 0) {
                a[row][j] = -1;
            }
        }
    }

    // Mark entire column
    private static void markCol(int[][] a, int col, int rowCount) {
        for (int i = 0; i < rowCount; i++) {
            if (a[i][col] != 0) {
                a[i][col] = -1;
            }
        }
    }
}
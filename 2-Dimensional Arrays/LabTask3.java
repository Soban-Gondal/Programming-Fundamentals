import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A_ROWS = 3, A_COLS = 4;
        final int B_ROWS = 4, B_COLS = 3; // must match A_COLS == B_ROWS

        int[][] A = new int[A_ROWS][A_COLS];
        int[][] B = new int[B_ROWS][B_COLS];

        System.out.println("Enter matrix A (" + A_ROWS + "x" + A_COLS + ") row by row:");
        for (int i = 0; i < A_ROWS; i++)
            for (int j = 0; j < A_COLS; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter matrix B (" + B_ROWS + "x" + B_COLS + ") row by row:");
        for (int i = 0; i < B_ROWS; i++)
            for (int j = 0; j < B_COLS; j++)
                B[i][j] = sc.nextInt();

        int[][] C = new int[A_ROWS][B_COLS]; // result size 3x3

        // multiplication: C[i][j] = sum over k of A[i][k] * B[k][j]
        for (int i = 0; i < A_ROWS; i++) {
            for (int j = 0; j < B_COLS; j++) {
                int sum = 0;
                for (int k = 0; k < A_COLS; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("Result matrix C (" + A_ROWS + "x" + B_COLS + "):");
        for (int i = 0; i < A_ROWS; i++) {
            for (int j = 0; j < B_COLS; j++) {
                System.out.print(C[i][j] + (j == B_COLS - 1 ? "" : "\t"));
            }
            System.out.println();
        }
        sc.close();
    }
}
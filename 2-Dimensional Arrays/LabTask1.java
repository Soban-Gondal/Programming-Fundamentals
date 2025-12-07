import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ROWS = 3, COLS = 4;
        int[][] a = new int[ROWS][COLS];

        System.out.println("Enter " + ROWS + "x" + COLS + " integers (row by row):");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // compute sums for rows
        int maxRowIndex = 0;
        int maxRowSum = Integer.MIN_VALUE;
        for (int i = 0; i < ROWS; i++) {
            int sum = 0;
            for (int j = 0; j < COLS; j++) sum += a[i][j];
            if (sum > maxRowSum) {
                maxRowSum = sum;
                maxRowIndex = i;
            }
        }

        // compute sums for columns
        int maxColIndex = 0;
        int maxColSum = Integer.MIN_VALUE;
        for (int j = 0; j < COLS; j++) {
            int sum = 0;
            for (int i = 0; i < ROWS; i++) sum += a[i][j];
            if (sum > maxColSum) {
                maxColSum = sum;
                maxColIndex = j;
            }
        }

        System.out.println("Row sums:");
        for (int i = 0; i < ROWS; i++) {
            int sum = 0;
            for (int j = 0; j < COLS; j++) sum += a[i][j];
            System.out.println(" Row " + i + " sum = " + sum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < COLS; j++) {
            int sum = 0;
            for (int i = 0; i < ROWS; i++) sum += a[i][j];
            System.out.println(" Col " + j + " sum = " + sum);
        }

        System.out.println("Row having maximum sum: Row " + maxRowIndex + " (sum = " + maxRowSum + ")");
        System.out.println("Column having maximum sum: Column " + maxColIndex + " (sum = " + maxColSum + ")");
        sc.close();
    }
}
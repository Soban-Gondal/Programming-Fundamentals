import java.util.Scanner;

public class LabTask2 {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0)
            return false;
        int r = (int) Math.sqrt(n);
        for (int i = 3; i <= r; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

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

        // count primes per row
        int maxPrimeRowIndex = 0;
        int maxPrimeRowCount = Integer.MIN_VALUE;
        for (int i = 0; i < ROWS; i++) {
            int cnt = 0;
            for (int j = 0; j < COLS; j++)
                if (isPrime(a[i][j]))
                    cnt++;
            if (cnt > maxPrimeRowCount) {
                maxPrimeRowCount = cnt;
                maxPrimeRowIndex = i;
            }
            System.out.println("Row " + i + " prime count = " + cnt);
        }

        // count primes per column
        int maxPrimeColIndex = 0;
        int maxPrimeColCount = Integer.MIN_VALUE;
        for (int j = 0; j < COLS; j++) {
            int cnt = 0;
            for (int i = 0; i < ROWS; i++)
                if (isPrime(a[i][j]))
                    cnt++;
            if (cnt > maxPrimeColCount) {
                maxPrimeColCount = cnt;
                maxPrimeColIndex = j;
            }
            System.out.println("Col " + j + " prime count = " + cnt);
        }

        System.out.println(
                "Row with maximum number of primes: Row " + maxPrimeRowIndex + " (count = " + maxPrimeRowCount + ")");
        System.out.println("Column with maximum number of primes: Column " + maxPrimeColIndex + " (count = "
                + maxPrimeColCount + ")");
        sc.close();
    }
}
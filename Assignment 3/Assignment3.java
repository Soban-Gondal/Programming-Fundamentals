
import java.util.Scanner;
public class Assignment3 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
 
        
        int choice;


        do {             
            System.out.println("\n--- Main Menu (Assignment-3) -------");
            System.out.println("1 - Question 1 (Matrix Multiplication)");
            System.out.println("2 - Question 2 (For Finding Rows and Column With Same Elements)");
            System.out.println("3 - Question 3 (For Sorting a's, b's, and c's))");
            System.out.println("4 - Question 4 (Menu For 1D-Array)");
            System.out.println("5 - Question 5 (For Optimizing The Grid)");
            System.out.println("0 - Exit");
            System.out.print("Enter your option: ");
	        choice = sc.nextInt();


            switch (choice) 
            {
                case 1: MatrixMultiplication(); break;
                case 2: FindPattern(); break;
                case 3: Sorting(); break;
                case 4: OneDMenu(); break;
                case 5: OptimizingGrid(); break;
                case 0: System.out.println("Exiting... Goodbye!"); break;
                default: System.out.println("Invalid option! Please enter 0-5.");
            }

        } while (choice != 0);

        sc.close();
    }
    

    public static void MatrixMultiplication()
    {
        System.out.println("\n--- Executing Question 1: Matrix Multiplication ---");
        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                B[i][j] = sc.nextInt();
            }
        }

        if (c1 != r2) 
        {
            System.out.println("Matrix multiplication NOT possible.");
            System.out.println("Columns of Matrix A must equal rows of Matrix B.");
            return;
        }

       
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
     }
    
    public static void FindPattern()
     {
        System.out.println("\n--- Executing Question 2: Pattern Finder ---");
        System.out.print("Enter the size for the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        
        boolean rowFound = false;
        for (int i = 0; i < n; i++) 
        {
            boolean allZero = true;
            boolean allOne = true;

            for (int j = 0; j < n; j++) 
            {
                if (matrix[i][j] != 0) allZero = false;
                if (matrix[i][j] != 1) allOne = false;
            }

            if (allZero) 
            {
                System.out.println("All 0s on row " + i);
                rowFound = true;
            }
            if (allOne) 
            {
                System.out.println("All 1s on row " + i);
                rowFound = true;
            }
        }
        if (!rowFound)
            System.out.println("No same numbers on a row");

        
        boolean colFound = false;
        for (int j = 0; j < n; j++) 
        {
            boolean allZero = true;
            boolean allOne = true;

            for (int i = 0; i < n; i++) 
            {
                if (matrix[i][j] != 0) allZero = false;
                if (matrix[i][j] != 1) allOne = false;
            }

            if (allZero) 
            {
                System.out.println("All 0s on column " + j);
                colFound = true;
            }
            if (allOne) 
            {
                System.out.println("All 1s on column " + j);
                colFound = true;
            }
        }
        if (!colFound)
            System.out.println("No same numbers on a column");

        
        boolean allZeroMajor = true;
        boolean allOneMajor = true;
        for (int i = 0; i < n; i++) 
        {
            if (matrix[i][i] != 0) allZeroMajor = false;
            if (matrix[i][i] != 1) allOneMajor = false;
        }
        if (allZeroMajor)
            System.out.println("All 0s on the major diagonal");
        else if (allOneMajor)
            System.out.println("All 1s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");

        
        boolean allZeroSub = true;
        boolean allOneSub = true;
        for (int i = 0; i < n; i++) 
        {
            if (matrix[i][n - 1 - i] != 0) allZeroSub = false;
            if (matrix[i][n - 1 - i] != 1) allOneSub = false;
        }
        if (allZeroSub)
            System.out.println("All 0s on the sub-diagonal");
        else if (allOneSub)
            System.out.println("All 1s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }

    public static void Sorting() 
    {
        System.out.println("\n--- Executing Question 3: For Sorting a's, b's, and c's ---");
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c];

        System.out.println("Enter characters (a/b/c only):");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.next().charAt(0);

        char[][] res = new char[r][c];
        int k = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (arr[i][j] == 'a')
                    res[k/c][k++%c] = 'a';


        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (arr[i][j] == 'b')
                    res[k/c][k++%c] = 'b';


        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (arr[i][j] == 'c')
                    res[k/c][k++%c] = 'c';

        System.out.println("Arranged 2D Array:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static void OneDMenu() 
    {
        System.out.println("\n--- Executing Question 4: Menu For 1D-Array ---");
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
         for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        while (true)
        {
            System.out.println("\n--- 2D ARRAY MENU ---");
            System.out.println("1. Count digit");
            System.out.println("2. Frequencies of All Elements");
            System.out.println("3. Circular Neighbor Sum Replace");
            System.out.println("4. Shift Circular Left 2 (Row Wise)");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 5) break;
            if (ch == 1) countX2D(arr, r, c);
            if (ch == 2) freq2D(arr, r, c);
            if (ch == 3) circularSum2D(arr, r, c);
            if (ch == 4) shiftLeft2D(arr, r, c);
        }
    }


    static void countX2D(int[][] arr, int r, int c) 
    {
            System.out.print("Enter digit to count: ");
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (arr[i][j] == x)
                    count++;

        System.out.println("Occurrences of " + x + " = " + count);
    }

    static void freq2D(int[][] arr, int r, int c) 
    {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) 
            {
                int x = arr[i][j];
                int f = 0;
                for (int m = 0; m < r; m++)
                    for (int n = 0; n < c; n++)
                        if (arr[m][n] == x)
                            f++;

                System.out.println(x + " - " + f);
            }
    }


    static void circularSum2D(int[][] arr, int r, int c) 
    {
        int n = r * c;
        int[] flat = new int[n];
        int k = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                flat[k++] = arr[i][j];

        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = flat[(i+1)%n] + flat[(i+2)%n];

        k = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = res[k++];

        System.out.println("Updated 2D after circular sum:");
        print2D(arr, r, c);
    }

    static void shiftLeft2D(int[][] arr, int r, int c) 
    {
        for (int i = 0; i < r; i++) 
         {
            for (int s = 0; s < 2; s++) 
            {
                int first = arr[i][0];
                for (int j = 0; j < c-1; j++)
                    arr[i][j] = arr[i][j+1];
                arr[i][c-1] = first;
            }
        }
        System.out.println("Matrix after shifting each row left by 2:");
        print2D(arr, r, c);
    }

    static void print2D(int[][] arr, int r, int c) 
    {
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }


    public static void OptimizingGrid() 
    {
        System.out.println("\n--- Executing Question 5: For Optimizing The Grid ---");
        System.out.print("Enter rows and columns for grid: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[r][c];

        System.out.println("Enter energy consumption values (kWh):");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                grid[i][j] = sc.nextInt();

        System.out.print("Enter threshold: ");
        int t = sc.nextInt();

        System.out.println("\nOriginal Grid:");
        print2D(grid, r, c);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (grid[i][j] > t) 
                {
                    int sum = 0, count = 0;

                    if (i > 0) { sum += grid[i-1][j]; count++; }    
                    if (i < r-1) { sum += grid[i+1][j]; count++; }   
                    if (j > 0) { sum += grid[i][j-1]; count++; }     
                    if (j < c-1) { sum += grid[i][j+1]; count++; }   

                    grid[i][j] = sum / count;  
                }

        System.out.println("\nOptimized Grid:");
        print2Ds(grid, r, c);
    }

    static void print2Ds(int[][] arr, int r, int c) 
    {
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }   
    }
}
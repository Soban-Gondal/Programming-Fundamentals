import java.io.*;
import java.util.*;

public class Task3 {

    // Prime checking function
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            // Read from file
            File file = new File("data.txt");
            Scanner fr = new Scanner(file);

            while (fr.hasNextInt()) {
                list.add(fr.nextInt());
            }
            fr.close();

            // Remove prime numbers
            ArrayList<Integer> newList = new ArrayList<>();
            for (int n : list) {
                if (!isPrime(n)) {
                    newList.add(n);
                }
            }

            // Write back to the same file
            FileWriter fw = new FileWriter("data.txt");
            for (int n : newList) {
                fw.write(n + "\n");
            }
            fw.close();

            System.out.println("Prime numbers removed and file updated successfully.");

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
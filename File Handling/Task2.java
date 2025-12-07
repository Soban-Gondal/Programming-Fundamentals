import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            File file = new File("data.txt");
            Scanner fr = new Scanner(file);

            while (fr.hasNextInt()) {
                list.add(fr.nextInt());
            }
            fr.close();

            Collections.sort(list);  // Sort ascending

            System.out.println("Sorted Data:");
            for (int num : list)
                System.out.println(num);

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
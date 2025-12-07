import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("data.txt");

            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                fw.write(num + "\n");
            }

            fw.close();
            System.out.println("Data saved successfully in data.txt");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
import java.io.*;
import java.util.*;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Question 1");
            System.out.println("2. Question 2");
            System.out.println("3. Question 3");
            System.out.println("4. Question 4");
            System.out.println("5. Question 5");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    question1();
                    break;
                case 2:
                    question2(input);
                    break;
                case 3:
                    question3(input);
                    break;
                case 4:
                    question4(input);
                    break;
                case 5:
                    question5(input);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

   
    public static void question1() {
        try {
            FileWriter fw = new FileWriter("file.txt");  // append mode
            Random rand = new Random();

            for (int i = 0; i < 100; i++) {
                fw.write(rand.nextInt(1000) + " ");
            }

            fw.close();
            System.out.println("100 random integers written to file.txt");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

  
    public static void question2(Scanner input) {
        try {
            System.out.print("Enter filename: ");
            String fileName = input.nextLine();

            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

   
    public static void question3(Scanner input) {
        try {
            System.out.print("Enter year (2015 - 2018): ");
            int year = input.nextInt();
            input.nextLine();

            System.out.print("Enter gender (M/F): ");
            String gender = input.nextLine().toUpperCase();

            System.out.print("Enter name: ");
            String name = input.nextLine();

            String fileName = "babynameranking" + year + ".txt";
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("Ranking file not found.");
                return;
            }

            Scanner reader = new Scanner(file);
            boolean found = false;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split("\\s+");

                int rank = Integer.parseInt(data[0]);
                String boyName = data[1];
                String girlName = data[3];

                if (gender.equals("M") && boyName.equalsIgnoreCase(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    found = true;
                    break;
                }

                if (gender.equals("F") && girlName.equalsIgnoreCase(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found)
                System.out.println("Name not found in ranking for year " + year);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

  
    public static void question4(Scanner input) {
        try {
            System.out.print("Enter filename containing integers: ");
            String fileName = input.nextLine();

            Scanner reader = new Scanner(new File(fileName));
            FileWriter errorLog = new FileWriter("error_log.txt");

            int sum = 0;
            int lineNum = 0;

            while (reader.hasNextLine()) {
                lineNum++;
                String line = reader.nextLine();

                try {
                    int num = Integer.parseInt(line.trim());
                    sum += num;
                } catch (Exception e) {
                    errorLog.write("Line " + lineNum + ": Invalid value -> " + line + "\n");
                }
            }

            reader.close();
            errorLog.close();

            System.out.println("Total sum of valid integers: " + sum);
            System.out.println("Errors logged to error_log.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public static void question5(Scanner input) {
        try {
            System.out.print("Enter filename: ");
            String fileName = input.nextLine();

            System.out.print("Enter word to search: ");
            String word = input.nextLine();

            Scanner reader = new Scanner(new File(fileName));

            int lineNum = 0;
            boolean found = false;
            ArrayList<Integer> lines = new ArrayList<>();

            while (reader.hasNextLine()) {
                lineNum++;
                String line = reader.nextLine();

                if (line.toLowerCase().contains(word.toLowerCase())) {
                    found = true;
                    lines.add(lineNum);
                }
            }

            reader.close();

            if (found) {
                System.out.println("Word found on lines: " + lines);
            } else {
                System.out.println("Word not found.");
            }

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

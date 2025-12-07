import java.util.Scanner;

public class Assignment2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n--- Main Menu (Assignment-2) -------");
            System.out.println("1 – Question-1");
            System.out.println("2 – Question-2");
            System.out.println("3 – Question-3");
            System.out.println("4 – Question-4");
            System.out.println("5 – Question-5");
            System.out.println("0 – Exit");
            System.out.print("Enter your option: ");
            option = input.nextInt();
            input.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    question1();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4();
                    break;
                case 5:
                    question5();
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (option != 0);
    }


    static void question1() {
        char again;
        do {
            System.out.println("\n--- Executing Question – 1 -------");
            System.out.print("Enter a SSN (DDD-DD-DDDD): ");
            String ssn = input.nextLine();

            boolean valid = true;
            if (ssn.length() == 11) {
                for (int i = 0; i < ssn.length(); i++) {
                    char ch = ssn.charAt(i);
                    if (i == 3 || i == 6) {
                        if (ch != '-') valid = false;
                    } else if (ch < '0' || ch > '9') {
                        valid = false;
                    }
                }
            } else valid = false;

            if (valid)
                System.out.println(ssn + " is a valid social security number");
            else
                System.out.println(ssn + " is an invalid social security number");

            System.out.print("Execute again (y) or go to menu (b)? ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'y' || again == 'Y');
    }


    static void question2() {
        char again;
        do {
            System.out.println("\n--- Executing Question – 2 -------");
            System.out.print("Enter a character (M , C or I) and a number from 1-4 seperated by spaces: ");
            String s = input.nextLine();

            if (s.length() == 2) {
                char major = Character.toUpperCase(s.charAt(0));
                char year = s.charAt(1);
                String majorName = "", status = "";

                if (major == 'M') majorName = "Mathematics";
                else if (major == 'C') majorName = "Computer Science";
                else if (major == 'I') majorName = "Information Technology";

                if (year == '1') status = "Freshman";
                else if (year == '2') status = "Sophomore";
                else if (year == '3') status = "Junior";
                else if (year == '4') status = "Senior";

                if (majorName.equals("") || status.equals(""))
                    System.out.println("Invalid input");
                else
                    System.out.println(majorName + " " + status);
            } else
                System.out.println("Invalid input");

            System.out.print("Execute again (y) or go to menu (b)? ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'y' || again == 'Y');
    }


    static void question3() {
        char again;
        do {
            System.out.println("\n--- Executing Question – 3 -------");
            String plate = "";
            for (int i = 0; i < 3; i++) {
                char letter = (char) ('A' + (int) (Math.random() * 26));
                plate += letter;
            }
            for (int i = 0; i < 4; i++) {
                int digit = (int) (Math.random() * 10);
                plate += digit;
            }
            System.out.println("Generated Plate Number: " + plate);

            System.out.print("Execute again (y) or go to menu (b)? ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'y' || again == 'Y');
    }


    static void question4() {
        char again;
        do {
            System.out.println("\n--- Executing Question – 4 -------");
            System.out.print("Enter a decimal number: ");
            int num = input.nextInt();
            input.nextLine();

            String binary = "";
            int n = num;
            if (n == 0) binary = "0";
            while (n > 0) {
                int bit = n % 2;
                binary = bit + binary;
                n = n / 2;
            }
            System.out.println("Binary value: " + binary);

            System.out.print("Execute again (y) or go to menu (b)? ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'y' || again == 'Y');
    }


    static void question5() {
        char again;
        do {
            System.out.println("\n--- Executing Question – 5 -------");
            int score = 0;
            for (int q = 1; q <= 5; q++) {
                System.out.println("\nQuestion " + q + ":");
                if (q == 1) {
                    System.out.println("What gas is primarily responsible for global warming?");
                    System.out.println("1) Oxygen  2) Nitrogen  3) Carbon Dioxide  4) Helium");
                    if (input.nextInt() == 3) score++;
                } else if (q == 2) {
                    System.out.println("Which of these is a renewable energy source?");
                    System.out.println("1) Coal  2) Wind  3) Oil  4) Natural Gas");
                    if (input.nextInt() == 2) score++;
                } else if (q == 3) {
                    System.out.println("Which organization shared the 2007 Nobel Peace Prize with Al Gore?");
                    System.out.println("1) NASA  2) IPCC  3) WHO  4) UNDP");
                    if (input.nextInt() == 2) score++;
                } else if (q == 4) {
                    System.out.println("Which process traps heat in Earth's atmosphere?");
                    System.out.println("1) Photosynthesis  2) Reflection  3) Greenhouse Effect  4) Evaporation");
                    if (input.nextInt() == 3) score++;
                } else if (q == 5) {
                    System.out.println("Which website provides balanced info on climate science?");
                    System.out.println("1) NASA.gov  2) Wikipedia  3) Twitter  4) Reddit");
                    if (input.nextInt() == 1) score++;
                }
            }

            System.out.println("\nYou got " + score + " correct!");
            if (score == 5) System.out.println("Excellent!");
            else if (score == 4) System.out.println("Very good!");
            else {
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Suggested sites: nasa.gov, climate.gov, skepticalscience.com");
            }

            System.out.print("Execute again (y) or go to menu (b)? ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'y' || again == 'Y');
    }
}

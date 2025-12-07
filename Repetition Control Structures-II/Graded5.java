import java.util.Scanner;

public class Graded5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input year and first day
        System.out.print("Enter year: ");
        int year = in.nextInt();

        System.out.print("Enter first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int firstDay = in.nextInt();

        // Month names
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Days in each month
        int[] daysInMonth = {
                31, // Jan
                28, // Feb (will adjust for leap year)
                31, // Mar
                30, // Apr
                31, // May
                30, // Jun
                31, // Jul
                31, // Aug
                30, // Sep
                31, // Oct
                30, // Nov
                31  // Dec
        };

        // Leap year adjustment
        if (year % 4 == 0) {
            daysInMonth[1] = 29; // February = 29
        }

        // Print each month
        int startDay = firstDay;
        for (int month = 0; month < 12; month++) {
            // Print month title
            System.out.println("\n          " + months[month] + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            // Print initial spaces
            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            // Print days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%4d", day);

                // Move to next line after Saturday
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("\n");

            // Update start day for next month
            startDay = (startDay + daysInMonth[month]) % 7;
        }
    }
}

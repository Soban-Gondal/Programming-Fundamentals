import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int d1 = num % 10;        
        int d2 = (num / 10) % 10; 
        int d3 = (num / 100) % 10;
        int d4 = (num / 1000) % 10;
        int d5 = (num / 10000) % 10;

        System.out.println("Reversed number: " + d1 + d2 + d3 + d4 + d5);

        sc.close();
    }
}

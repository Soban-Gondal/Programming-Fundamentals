import java.util.Scanner;
public class Grad6
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
	double payRate = 15.50;
        System.out.print("Enter number of hours you worked each week: ");
        double hours = input.nextDouble();
        double grossIncome = payRate * hours * 5;
        double netIncome = grossIncome - (grossIncome * 0.14);
        double clothes = netIncome * 0.10;
        double schoolSupplies = netIncome * 0.01;
        double remaining = netIncome - (clothes + schoolSupplies);
        double savingsBonds = remaining * 0.25;
        double parentsBonds = savingsBonds * 0.50;
        System.out.printf("a. Income before taxes: $%.2f%n", grossIncome);
        System.out.printf("   Income after taxes: $%.2f%n", netIncome);
        System.out.printf("b. Money spent on clothes and accessories: $%.2f%n", clothes);
        System.out.printf("c. Money spent on school supplies: $%.2f%n", schoolSupplies);
        System.out.printf("d. Money spent on savings bonds: $%.2f%n", savingsBonds);
        System.out.printf("e. Money your parents spent on additional savings bonds: $%.2f%n", parentsBonds);
	}
}
	 
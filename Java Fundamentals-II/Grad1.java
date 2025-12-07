import java.util.Scanner;
public class Grad1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		double cents;
		double dollars;
		double dimes;
		double nickels;
		double pennies;
		double quarters;
		System.out.print("Enter the amount as a decimal number");
		double amount=input.nextDouble();
		cents=amount*100;
		dollars=cents/100;
		cents=cents%100;
		quarters=cents/25;
		cents=cents%100;
		dimes=cents/10;
		cents=cents%100;
		nickels=cents/5;
		cents=cents%100;
		pennies=cents;
		System.out.println("The amount consists of:");
		System.out.println("Dollars are "+dollars);
		System.out.println("Quarters are "+quarters);
		System.out.println("Dimes are "+dimes);
		System.out.println("Nickels are "+nickels);
		System.out.println("Pennies are "+pennies);
	}
}		
import java.util.Scanner;
public class Grad3
{
	public static void main(String[] args)
	{
		Scanner console=new Scanner(System.in);
		int SECRET=1;
		double RATE=12.50;
		int num1,num2,newNum;
		String name;
		double hoursWorked,wages;
		System.out.print("Enter two integers seperated by space");
		num1 = console.nextInt();
		num2 = console.nextInt();
		System.out.println("The value of num1 ="+num1);
		System.out.println("The value of num2 ="+num2);
		newNum = num1*2+num2;
		System.out.println("The value of newNum ="+newNum);
		newNum = newNum+SECRET;
		System.out.println("The value of newNum after adding SECRET ="+newNum);
		System.out.print("Enter your last name");
		name = console.next();
		System.out.println(name);
		System.out.println("enter decimal no. between 0 and 70");
		hoursWorked = console.nextDouble();
		wages = RATE*hoursWorked;
		System.out.println("Name ="+name);
		System.out.println("Pay Rate ="+RATE);
		System.out.println("Hours Worked ="+hoursWorked);
		System.out.println("Salary ="+wages);
	}
}
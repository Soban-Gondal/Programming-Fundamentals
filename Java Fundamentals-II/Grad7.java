import java.util.*;

public class Grad7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);


		System.out.print("How many tickets were sold of class A?");
		int a=sc.nextInt();
		System.out.println();

		System.out.print("How many tickets were sold of class B?");
		int b=sc.nextInt();
		System.out.println();

		System.out.print("How many tickets were sold of class C?");
		int c=sc.nextInt();
		System.out.println();

		System.out.print("How many tickets were sold of class D?");
		int d=sc.nextInt();
		System.out.println();

		int totalIncome;
		totalIncome=a*20+b*15+c*10+d*5;
		System.out.println("Total income generated is "+totalIncome+'$');
	}
}	
		
import java.util.*;
public class Grad4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers separated by spaces");
		int a=sc.nextInt();
		int b=sc.nextInt();


		if(a<b)
		System.out.println("The smaller value is "+a);

		if(b<a)
		System.out.println("The smaller value is "+b);

		System.out.println("Enter value of X");
		int X=sc.nextInt();		
		
		if(X>0)
		System.out.println("X is Positive");

		else if(X<0)
		System.out.println("X is negative");
	
		else
		System.out.println("X is equal to 0");
	

		System.out.println("Enter three numbers separated by spaces");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		if(num1<num2 && num1<num3)
		System.out.println("The smallest value is "+num1);

		else if(num2<num1 && num2<num3)
		System.out.println("The smallest value is "+num2);

		else
		System.out.println("The smallest value is "+num3);




	}
}
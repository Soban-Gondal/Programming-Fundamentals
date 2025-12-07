import java.util.*;
public class Grad8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,sum;
		System.out.print("Enter an integer between 0 to 1000 ");
		int no=sc.nextInt();
		System.out.println();

		num1=no/100;
		no=no%100;
		num2=no/10;
		no=no%10;
		num3=no/1;
		sum=num1+num2+num3;
		
		System.out.println("Sum of all its digits is "+sum);
	}
}
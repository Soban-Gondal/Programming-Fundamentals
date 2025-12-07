import java.util.*;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number=sc.nextInt();
		
		if (number>0){
			System.out.println("The number is positive");
			if (number%2==0)
				System.out.println("It is an even number");
			else
				System.out.println("It is an odd number");}
		else if (number<0)
			System.out.println("The number is negative");
		else
			System.out.println("The number is zero");
	sc.close();
	}
}
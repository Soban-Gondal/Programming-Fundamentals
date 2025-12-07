import java.util.*;
public class Task4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter years of service");
		int yearsOfService=sc.nextInt();
		
		if(yearsOfService<3)
			System.out.println("Not eligible for bonus");
		else{
			System.out.println("Enter performance rating(1,2, or 3)");
		int rating=sc.nextInt();
			if(rating==3)
				System.out.println("Bonus: $10,000");
			else if(rating==2)
				System.out.println("Bonus: $5,000");
			else if(rating==1)
				System.out.println("Bonus: $2,000");
			else
				System.out.println("Invalid rating! Please enter 1, 2, or 3.");}
	sc.close();
	}
}

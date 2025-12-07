import java.util.*;
public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand=new Random();
		int computerChoice=rand.nextInt(3);
		System.out.println("Enter your choice(0 for scissors,1 for rock, 2 for paper):");
		int userChoice=sc.nextInt();
		System.out.println("Computer Choice:"+ computerChoice);
		System.out.println("User Choice:"+ userChoice);
if (userChoice==computerChoice)
	System.out.println("Its a draw");
else if(userChoice==0 && computerChoice==2)
	System.out.println("You win!");
else if(userChoice==1 && computerChoice==0)
	System.out.println("You win!");
else if(userChoice==2 && computerChoice==1)
	System.out.println("You win!");
else
	System.out.println("Computer wins!");

	}
}	
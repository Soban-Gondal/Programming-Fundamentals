import java.util.*;
public class Graded1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int max=0;
	System.out.println("Enter the sequence : ");
	
	while (true)
	{
		int num=sc.nextInt();
	if (num==0)
	{
		break;
		}
		
		if(num>max)
	{
		max=num;
		
		}
		}
		System.out.println("The index of largest no. before zero is :" +max);
	}
}

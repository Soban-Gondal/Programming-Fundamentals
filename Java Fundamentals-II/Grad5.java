import java.util.Scanner;
public class Grad5
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	float litres;
	System.out.print("enter the total amount of milk produced in the morning: ");
	litres = in.nextFloat();
	float cartons = (float)(litres / 3.78);
	System.out.println("number of milk cartons needed to hold milk = "+ (int)cartons);
	System.out.println("cost of producing milk = $"+ litres*0.38);
	System.out.println("profit for producing milk = $"+ cartons*0.27);	
	}	
}
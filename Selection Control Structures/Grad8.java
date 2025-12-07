import java.util.Scanner;
public class Grad8
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.print("enter the month (in numeric form): ");
	int month = in.nextInt();
	System.out.print("enter the Day: ");
	int day = in.nextInt();
	System.out.print("enter the Year(last 2 digits): ");
	int year= in.nextInt();
	if((month * day) == year)
	System.out.print("the date is magic");
        else
	System.out.print("the date is not magic");
}
}
import java.util.Scanner;
public class Grad7
{
	public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.print("enter length of first rectangle ");
	int a = in.nextInt();
	System.out.print("enter width of first rectangle ");	
	int b = in.nextInt();
	System.out.print("enter length of second rectangle ");
	int c = in.nextInt();
	System.out.print("enter width of second rectangle ");	
	int d = in.nextInt();
	int area1 = a*b;
	int area2 = c*d;
	System.out.println("Area of first rectangle "+area1);
	System.out.println("Area of second rectangle "+area2);
	if (area1 == area2)
	System.out.print("Area of both rectangle is same");
	else if(area1 > area2)
	System.out.print("Area of first rectangle is greater than area of second rectangle");
	else if(area1 < area2)
	System.out.print("Area of second rectangle is greater than area of first rectangle");	
	else
	System.out.print("Invalid Input");
}
}
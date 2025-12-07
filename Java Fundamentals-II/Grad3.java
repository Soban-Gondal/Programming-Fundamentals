import java.util.Scanner;
public class Grad3
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter the number of students in class 1 = ");
	a = in.nextInt();
	System.out.print("Enter the number of students in class 2 = ");
	b = in.nextInt();
	System.out.print("Enter the number of students in class 3 = ");
	c = in.nextInt();
	int deska = (a+1)/2;
	int deskb = (b+1)/2;
	int deskc = (c+1)/2;
	int desk = deska + deskb + deskc ;
	System.out.print("Minimum desks required = "+ desk);
	}
}

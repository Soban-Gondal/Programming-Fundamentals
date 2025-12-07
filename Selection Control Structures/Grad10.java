import java.util.Scanner;
public class Grad10
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter no. of Books you bought: ");
	int books = in.nextInt();
	if ( books == 0)
	System.out.print("you earned "+0+" points");
	if ( books == 1)
	System.out.print("you earned "+5+" points");
	if ( books == 2)
	System.out.print("you earned "+15+" points");
	if ( books == 3)
	System.out.print("you earned "+30+" points");
	if ( books >= 4)
	System.out.print("you earned "+60+" points");
	}
}
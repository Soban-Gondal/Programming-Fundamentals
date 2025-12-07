import java.util.Scanner;
public class Grad4
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int N;
	System.out.print("Enter the number of minutes that is passed since midnight: ");
	N = in.nextInt();
	int hours = (N / 60) % 24;
	int minutes = N % 60;
	System.out.print(hours+" "+minutes);
	}
}

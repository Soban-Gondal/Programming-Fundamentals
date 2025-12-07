import java.util.Scanner;
public class Graded2
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the limit of numbers: ");
	int num = in.nextInt();
	int even=0;
	System.out.print("Enter the sequence: ");
	for(int i=1; i<=num;i++)
	{
	int Num = in.nextInt();
	if(Num%2==0)
	even = even+1;
	}
	System.out.print("you entered "+even+" even no.s");
	}
}
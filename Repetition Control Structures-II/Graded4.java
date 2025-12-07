public class Graded4
{
	public static void main(String[] args) 
	{
	for(int i=1; i<=4; i++)
	{
	for(int j=1; j<=10; j++)
	System.out.print("*");
	System.out.print("\n");
	}


	for(int i=1; i<=5; i++)
	{
	for(int j=1; j<=i; j++)
	System.out.print("*");
	System.out.print("\n");
	}


	for (int i = 1; i <= 5; i++) 
	{
	for (int j = i; j < 5; j++) {
        System.out.print(" ");
	}
	for (int k = 1; k <=i; k++) 
	{
	System.out.print("*");
	}
	System.out.print("\n");
	}


	for (int i = 1; i <= 5; i++) 
	{

	for (int j = i; j < 5; j++) {
        System.out.print(" ");
	}
	for (int k = 1; k <= (2 * i - 1); k++) 
	{
	System.out.print("*");
	}
	System.out.print("\n");
	}

	for (int i = 1; i <= 5; i++) 
	{

	for (int j = i; j < 5; j++) {
        System.out.print(" ");
	}
	for (int k = 1; k <= (2 * i - 1); k++) 
	{
	System.out.print(i);
	}
	System.out.print("\n");
	}
	}
}


	
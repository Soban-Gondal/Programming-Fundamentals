import java.util.Scanner;

public class Graded3
{
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);      
        int max = 0;     
	System.out.print("Enter the sequence: ");
        while (true) 
	{
        int num = in.nextInt();
        if (num == 0)
	{
        break;  
        }  
        if (num > max) 
	{
        max = max+1; 
        }
        }
        System.out.println(max+" elements of this sequence are greater than their neighbours above" );
    }
}

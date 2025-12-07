import java.util.*;
public class Grad2{
	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		int da,basket;

		System.out.print("Enter no of students ");
		int st=input.nextInt();
		System.out.println();

		System.out.print("Enter no of apples ");
		int a=input.nextInt();
		System.out.println();

		da=a/st;
		basket=a%st;
		
		System.out.println("Each student  will get "+da +"apples");
		System.out.println("Apples in basket are "+basket);
	}
}
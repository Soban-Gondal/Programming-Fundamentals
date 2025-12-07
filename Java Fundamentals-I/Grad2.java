import java.util.*;
public class Grad2
{

public static void main (String[] args){
Scanner console = new Scanner (System.in) ;
int area;
int perimeter;
int length;
int width;

System.out.println ("Enter the length: ");
length = console.nextInt ();
System.out.println ();
System.out.println ("Enter the width: ");
width = console.nextInt ();
System.out.println ();
area = length * width;
perimeter = 2 * (length + width);
System.out.println ("Area = " + area);
System.out.println ("Perimeter = " + perimeter);
}
}
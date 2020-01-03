/*
Vincent Phan
09/05/19
*/
import java.util.*;
import java.util.Random.*;
import java.lang.Math.*;
public class Main
{
  public static void main(String args[])
  {
 	Scanner reader = new Scanner(System.in);
 	System.out.println("Enter your coordinates");
 	int x1 = reader.nextInt();
 	int y1 = reader.nextInt();
 	int x2 = reader.nextInt();
 	int y2 = reader.nextInt();
 
 	int num = (y2 - y1);//this sets the numerator
    int den = (x2 - x1);//this sets the denomator
 	
 	if(y1 == y2)
 	{
   	System.out.println("The line is horizontal so the slope is 0");
 	}
 	else if(x1 == x2)
 	{
   	System.out.println("The line is vertical so its slope is undefined");
 	}
 	else if(x1 != x2  && y1 != y2)
 	{
   	System.out.println("The slope is " + num + "/" + den);
 	}
  }
}


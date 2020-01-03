/*
Vincent Phan
09/05/19
*/
import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Main
{
   public static void main(String args[])
   {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter x1: ");
     double x1 = kbReader.nextDouble();
     int x3 = (int)x1;
     System.out.println("Enter y1: ");
     double y1 = kbReader.nextDouble();
     int y3 = (int)y1;
     System.out.println("Enter x2: ");
     double x2 = kbReader.nextDouble();
     int x4 = (int)x2;
     System.out.println("Enter y2: ");
     double y2 = kbReader.nextDouble();//These lines of code allow user to input their cord.
     int y4 = (int)y2;
     double num = (y2 - y1);//this sets the numerator
     double den = (x2 - x1);//this sets the denomator
     double s = (num / den);//finds the slope
     double yInt = (y1 -= s * x1); //finds y intercept
    
     System.out.println("slope = " + num + "/" + den);//prints the slope
     System.out.println("slope intercept: y = " + s + " + " + yInt);//prints slope intercept form
     System.out.println("The equation of the line containing (" + x3 + "," + y3 + ")" + " and (" + x4 + "," + y4 + ") is: " + (-s * -den) + "x " + " + " + -den + "y = " + (yInt * -den));//prints out standard equation
   }
}

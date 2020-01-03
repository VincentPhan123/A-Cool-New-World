/*
Vincent Phan
*/
import java.util.*; 
import java.lang.Math.*;

public class Main

{
  public static void main(String args[])
  {
		Scanner kbReader = new Scanner(System.in);

		System.out.println("Enter your 5 values: ");
		int x = kbReader.nextInt();
		int y = kbReader.nextInt();
		int z = kbReader.nextInt();
		int a = kbReader.nextInt();
		int b = kbReader.nextInt();//these lines of code take the user's input and saves it in different variables

    if (x > y && x > z && x > a && x > b)
    {
      System.out.println("The max number is: " + x);
    }
    else if (y > x && y > z && y > a && y > b)
    {
      System.out.println("The max number is: " + y);
    }
    else if (z > x && z > y && z > a && z > b)
    {
      System.out.println("The max number is: " + z);
    }
    else if (a > x && a > y && a > z && a > b)
    {
      System.out.println("The max number is: " + a);
    }
    else if (b > x && b > y && b > z && b > a)
    {
      System.out.println("The max number is: " + b);
    }
    // these lines of code check to see what the highest number is
// // // // // // // // // // // // // // // // // // // // // // // // // // // //     

    if (x < y && x < z && x < a && x < b)
    {
      System.out.println("The lowest number is: " + x);  
    }                                                        
    else if (y < x && y < z && y < a && y < b)             
    {                                                       
      System.out.println("The lowest number is: " + y);  
    }   
    else if (z < x && z < y && z < a&& z < b)
    {
      System.out.println("The lowest number is: " + z);
    }
    else if (a < x && a < y && a < z && a < b)
    {
      System.out.println("The lowest number is: " + a);
    }
    else if (b < x && b < y && b < z && b < a)
    {
      System.out.println("The lowest number is: " + b);
    }
      //These lines of code check to //see what the lowest number is
    
  
    
  }
}

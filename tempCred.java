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
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter your Name: ");
     String firstName = kbReader.next();
     String lastName = kbReader.next();
     double randUser = Math.random();
     randUser = randUser * 1000 + 1;
     int randUserInt = (int)randUser;
     double randPass = Math.random();
     randPass = randPass * 100000 + 100000;
     int randPassInt = (int)randPass;
		 

		 if (lastName.length() < 5)
		 {
			 System.out.println(lastName + firstName.substring(0, 1) + randUserInt);
		 }
		 else
		 {
			 System.out.println(lastName.substring(0,3) + firstName.substring(0, 1) + randUserInt);
		 }

     System.out.println("You temporary password is: " + randPassInt);
   }
}
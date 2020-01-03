/*
Vincent Phan
09/05/19
*/
import java.util.*;

public class Main
{
   public static void main(String args[])
   {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter a time(hour minutes seconds): ");
     int hour = kbReader.nextInt();
     int min = kbReader.nextInt();
     int secs = kbReader.nextInt();
     int hourSecs = hour * 3600;
     int minSecs = min * 60;
     int totalSecs = hourSecs + minSecs + secs;
     System.out.println("Here is your time converted into seconds: " + totalSecs);
    
   }
}
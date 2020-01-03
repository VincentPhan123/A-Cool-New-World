/*
Vincent Phan
09/05/19
*/
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is you name?");
        String s = kbReader.next();
        System.out.println("Nice to meet you " + s);

        System.out.println("What is your Favorite Food? ");
        String a = kbReader.next();

        System.out.println("What is your favorite genre of music? ");
        String b = kbReader.next();

        System.out.println("What is your dream car? ");
        String c = kbReader.next();

        System.out.println("If you had a millon dollars what would be the first thing you would buy? ");
        String d = kbReader.next();
        d = kbReader.next();
        
        System.out.println("Your favorite food was: " + a);
        System.out.println("Your favorite genre of music was: " + b);
        System.out.println("Your dream car was a: " + c);
        System.out.println("You would buy a " + d + " if you had a millon dollars.");
    }
}
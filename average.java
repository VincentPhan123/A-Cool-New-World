/*
Vincent Phan
9/5/19
*/

import java.util.*;

public class Main
{
  public static void main(String args[])
  {
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int num1 = kbReader.nextInt();
		int num2 = kbReader.nextInt();
		int num3 = kbReader.nextInt();
		System.out.println((num1 + num2 + num3) / 3);
	}
}

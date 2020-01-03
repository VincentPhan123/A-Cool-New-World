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

		System.out.println("Enter your Money: ");
		double money = kbReader.nextDouble();
		double twenty, ten, five, one, quarter, dime, nickel, penny;
		twenty = ten = five = one = quarter = dime = nickel = penny = 0.00;
		while(money > 0)
		{
			if(money >= 20)
			{
				money = money - 20;
				twenty++;
			}
			else if(money >= 10)
			{
				money = money - 10;
				ten++;
			}
			else if(money >= 5)
			{
				money = money - 5;
				five++;
			}
			else if(money >= 1)
			{
				money = money - 1;
				one++; 
			}
			else if(money >= .25)
			{
				money = money - .25;
				quarter++;
			}
			else if(money >= .10)
			{
				money = money - .10;
				dime++;
			}
			else if(money >= .5)
			{
				money = money - .5;
				nickel++;
			}
			else if(money >= .01)
			{
				money = money - 0.01;
				penny++;
		}			
	}
		System.out.println("You have " +twenty+ " twenty bills");
		System.out.println("You have " +ten+ " ten bills");	
		System.out.println("You have " +five+ " five bills");
		System.out.println("You have " +one+ " one bills");
		System.out.println("You have " +quarter+ " quarters");
		System.out.println("You have " +dime+ " dimes");
		System.out.println("You have " +nickel+ " nickels");
		System.out.println("You have " +penny+ " pennis");
	}
}
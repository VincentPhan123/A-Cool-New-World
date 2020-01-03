import java.util.Random.*;
import java.util.*;

public class randomNum{
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int guess;
		int guesses = 3;
		boolean win = false;
		boolean lost = false;
		Random random = new Random();
		int randNum = random.nextInt(101);
		System.out.println(randNum);
		
		while(win == false || lost == false){ 
			System.out.println("Enter your guess you have " + guesses + " guesses");
			guess = reader.nextInt();
			
			if(guesses == 0){
				System.out.println("You lost!\nThe answer was " + randNum);
				lost = true;
				break;
			}
			else if(guess == randNum){
				System.out.println("You won!\nYou had " + guesses + " guesses left");
				win = true;
				break;
			}
			else if(guess != randNum && guess > randNum){
				--guesses;
				System.out.println("Your guess was greater than the random number!\nYou have " + guesses + " guesses left!");
			}
			else if(guess != randNum && guess < randNum){
				--guesses;
				System.out.println("Your guess was less than the random number!\nYou have " + guesses + " guesses left!");
			}
			else if(guess < 100){
				System.out.println("Pick a number between 1-100");
			}
		
		}


	}
}

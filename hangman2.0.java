
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		String [] words = new String []{"Lol", "hi", "Bye", "sigh", "owl"};
		Random random = new Random();
		int randomWordNum = random.nextInt(5);
		
		String randomWord = words[randomWordNum];
		System.out.println(randomWord);
		userInput(words, randomWord);
	}
	
	static void userInput(String [] words, String randomWord) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcom to Hangman!\n---------------\n1)Play Game\n2)Rules\n3)Quit");
		String input = reader.next();
		if(input.equals("1")) {
			game(words, randomWord);
		}else if(input.equals("2")) {
			rules(words, randomWord);
		}else if(input.equals("3")){
			System.out.println("Bye!");
		}
	}
	
	static void game(String [] words, String randomWord) {
		Scanner reader = new Scanner(System.in);
		int fails = 0;
		int correct = 0;
		boolean done = false;
		char [] wordArray = randomWord.toCharArray();
		int lenOfWord = wordArray.length;
		System.out.println( lenOfWord + " letter word " );
	
		char [] place = new char [wordArray.length];
		
		for(int i = 0; i < wordArray.length; i++) {
			place[i] = "_".charAt(0);
			System.out.print( place[i]);
		}
		
		
		while(!done) {
			System.out.println("\nEnter your guess: ");
			System.out.println(fails + " / 6");
			char guess = reader.next().charAt(0);
			for(int i = 0; i < wordArray.length; i++) {
				if(guess == wordArray[i]) {
					place[i] = guess;
					System.out.print(place);
					correct++;
				}
			}

						
			if(!randomWord.equals(randomWord.indexOf(guess))) {
				System.out.println("That letter is not in the secret word");
				fails++;
			}
			
			if(correct == lenOfWord) {
				System.out.println("\nYOU WON!\nThe word was: " + randomWord);
				done = true;
			}else if(fails == 6) {
				System.out.println("YOU LOST!:(\nThe word was: " + randomWord);
				done = true;
			}

			
		}
		
	}
	
	static void rules(String [] words, String randomNumber) {
		System.out.println("RULES:\n1) Guess the random word given.\n2) You have 6 tries\n3) Have fun");
		userInput(words, randomNumber);
	}
	
	
}

	

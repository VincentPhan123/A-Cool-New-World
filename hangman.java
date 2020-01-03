import java.io.*;
import java.util.*;

public class hangman {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("C:\\Users\\phanv21\\Desktop\\50wrds.txt"));
		String [] words = new String [50];
		Random random = new Random();
		int randomWordNum = random.nextInt(50);
		int count = 0;
		
		while(count < 50) {
			words[count] = scanner.nextLine();
			count++;
		}
		
		
		scanner.close();
		
		String randomWord = words[randomWordNum];
		System.out.println(randomWord);
		userInput(words, randomWord);
		
	}
	
	static char[] printArray(char [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
	
	static void userInput(String [] words, String randomWord) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Hangman!\n---------------\n1)Play Game\n2)Rules\n3)Quit");
		String input = reader.next();
		if(input.equals("1")) {
			game(words, randomWord);
		}else if(input.equals("2")) {
			rules(words, randomWord);
		}else if(input.equals("3")){
			System.out.println("Bye!");
		}
	}
	
	static boolean contains(String str, char chr) {
		  return str.indexOf(chr) != -1;
		}
	
	static void game(String [] words, String randomWord) {
		Scanner reader = new Scanner(System.in);
		int fails = 0;
		int correct = 0;
		String lettersGuessed = "";
		boolean done = false;
		char [] wordArray = randomWord.toCharArray();
		
		
		
		int lenOfWord = wordArray.length;
		System.out.println( lenOfWord + " letter word " );
	
		char [] place = new char [wordArray.length];
		
		for(int i = 0; i < wordArray.length; i++) {
			place[i] = "-".charAt(0);
			System.out.print( place[i]);
		}
		
		
		while(!done) {
			System.out.println("\nEnter your guess: ");
			
			System.out.println(fails + " / 3");
			char guess = reader.next().charAt(0);
			String strGuess = Character.toString(guess);
			for(int i = 0; i < wordArray.length; i++) {
				if(guess == wordArray[i]) {
					place[i] = guess;
					lettersGuessed +=  guess + " ";
					System.out.print(place);
					System.out.println("\nWords Used: " + lettersGuessed);
					correct++;
				}
			}
			
			if(contains(randomWord, guess) == false) {
				System.out.println("That letter is not in the secret word");
				System.out.println("\nWords Used: " + lettersGuessed);
				lettersGuessed +=  guess + " ";
				fails++;
			}
			
			
			if(correct == lenOfWord) {
				System.out.println("\nYOU WON!\nThe word was: " + randomWord);
				done = true;
			}else if(fails == 3) {
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

	
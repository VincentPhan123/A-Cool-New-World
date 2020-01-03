import java.util.Random.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean done = false;
		System.out.println("Welcom to my string  method program\n -----------------");
		
		while(!done){
			
			System.out.println("Choose a method you like to use:\n A) isPalindrom\n B) findString\n C) replaceString\n D) stringCount\n E) shuffelString\n F) quit");
			String userInput = reader.next().toUpperCase();

			if(userInput.equals("A")) {
				System.out.println("Enter your word: ");
				String userWord = reader.next().toLowerCase();
				isPalindrom(userWord);
			}else if (userInput.equals("B")) {
				System.out.println("Enter a passage:");
				String userPassage = reader.nextLine().toLowerCase();
				System.out.println("Enter your target word: ");
				String userTarget = reader.next().toLowerCase();
				findString(userPassage, userTarget);
			}else if (userInput.equals("C")) {
				System.out.println("Enter your passage: ");
				String userPassage = reader.nextLine().toLowerCase();
				System.out.println("Enter your target word: ");
				String userTarget = reader.next().toLowerCase();
				System.out.println("Enter your new word: ");
				String userReplace = reader.next();
				replaceString(userPassage, userTarget, userReplace);
			}else if(userInput.equals("D")) {
				System.out.println("Enter a passage:");
				String userPassage = reader.nextLine().toLowerCase();
				System.out.println("Enter your target word: ");
				String userTarget = reader.next().toLowerCase();
				stringCount(userPassage, userTarget);
			}else if(userInput.equals("E")) {
				System.out.println("Enter a word you like to shuffel: ");
				String userWord = reader.next().toLowerCase();
				shuffelString(userWord);
			}
			else{
				done = true;
			}
		}
		
	} 
	
	static void isPalindrom(String userWord) {
		String  strReverse = "";
		for(int i = userWord.length() - 1; i >= 0; i--) {
			strReverse = strReverse + userWord.charAt(i) ;
		}
		if(userWord.equals(strReverse)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	static void findString(String userPassage, String userTarget) {
		int index = userPassage.indexOf(userTarget);
		while(index >= 0){
			System.out.print("Index(s): " + index);
			index = userPassage.indexOf(userTarget, index + userTarget.length());  
		}
	}				
	
	static void replaceString(String userPassage, String userTarget, String userReplace) {
		int index = userPassage.indexOf(userTarget);
		List<String> passageArray = new ArrayList<String>();
		passageArray.add(userPassage);

		passageArray.set(index, userReplace);

		System.out.println(passageArray);	
	}
	
	static void stringCount(String userPassage, String userTarget) {
		int index = userPassage.indexOf(userTarget);
		int numTarget = 0;
		while(index >= 0){
			numTarget++;
			System.out.println(userTarget + " occurs: " + numTarget);
			index = userPassage.indexOf(userTarget, index + userTarget.length());  	
		}
	}
	
	static void shuffelString(String userWord) {
		Random random = new Random();
		int wordLength = userWord.length();
		int randomChar = random.nextInt(wordLength);
		char[] charArray =  userWord.toCharArray();

		for(int i = 0; i < wordLength; i ++){
				char temp = charArray[i];
        charArray[i] = charArray[randomChar];
        charArray[randomChar] = temp;
		}

		System.out.println(charArray);
	}
}

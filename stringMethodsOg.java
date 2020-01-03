import java.util.Random.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your passage");
		String userPassage = reader.nextLine().toLowerCase();
		System.out.println("Enter your Target");
		String userTarget = reader.next().toLowerCase();
		System.out.println("Enter your replacement");
		String userReplace = reader.next().toLowerCase();
		System.out.println("Enter a word you would like to shuffle");
		String userWord = reader.next().toLowerCase();
		System.out.println("Enter a word to see if it is a palindrom");
		String userPalindrom = reader.next().toLowerCase();
		findString(userPassage, userTarget);
		stringCount(userPassage, userTarget);
		replaceString(userPassage, userTarget, userReplace);
		shuffelString(userWord);
		isPalindrom(userPalindrom);
	}
	
	static void findString(String userPassage, String userTarget) {
		int index = userPassage.indexOf(userTarget);
		while(index >= 0){
			System.out.println("Index(s): " + index );
			index = userPassage.indexOf(userTarget, index + userTarget.length());  
		}
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

	static void replaceString(String userPassage, String userTarget, String userReplace) {
		int index = userPassage.indexOf(userTarget);
		List<String> passageArray = new ArrayList<String>();
		passageArray.add(userPassage);

		passageArray.set(index, userReplace);

		System.out.println(passageArray);	
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

	static void isPalindrom(String userPalindrom) {
		String  strReverse = "";
		for(int i = userPalindrom.length() - 1; i >= 0; i--) {
			strReverse = strReverse + userPalindrom.charAt(i) ;
		}
		if(userPalindrom.equals(strReverse)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}

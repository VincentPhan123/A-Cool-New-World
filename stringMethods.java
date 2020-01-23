import java.util.*;

public class stringgMethods {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a passage:");
		String userPassage = reader.nextLine();
		String [] arrayPassage = userPassage.split(" ");
		System.out.println("Enter your target word:");
		String userTarget = reader.next();
		findString(arrayPassage, userTarget);
		System.out.println("Enter the word you would like to replace:");
		String userTarget2 = reader.next();
		System.out.println("Enter you replacement:");
		String userReplace = reader.next();
		replaceString(arrayPassage, userTarget2, userReplace);
		System.out.println("Enter the word to see how many times it occurs in the passage:");
		String userTarget3 = reader.next();
		stringCount(arrayPassage, userTarget3);
		System.out.println("Enter a word to see if it is a palindrom:");
		String userWord = reader.next();
		isPalindrom(userWord);
		System.out.println("Enter a word you would like to shuffle:");
		String userWord2 = reader.next();
		shuffleString(userWord2);
		
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
	
	static void findString(String [] arrayPassage, String userTarget) {
		String index = "";
		for(int i = 0; i < arrayPassage.length; i++) {
			if(arrayPassage[i].equals(userTarget)) {
				index += i + " ";
				}
		}
		System.out.println("The index(s) of " + userTarget + ": " + index);
	}				
	
	static void replaceString(String [] arrayPassage, String userTarget2, String userReplace) {
		String passage = "";
		for(int i = 0; i < arrayPassage.length; i++) {
			if(arrayPassage[i].equals(userTarget2)) {
				arrayPassage[i] = userReplace;
			}
		}
		for(int i = 0; i < arrayPassage.length; i++) {
			passage += arrayPassage[i] + " ";
		}
		System.out.println(passage);
	}
	
	static void stringCount(String [] arrayPassage, String userTarget3) {
		int count = 0;
		for(int i = 0; i < arrayPassage.length; i++) {
			if(arrayPassage[i].equals(userTarget3)) {
				count++;
			}
		}
		System.out.println(userTarget3 + " occurs " + count + " times.");
	}
	
	static void shuffleString(String userWord2) {
		Random random = new Random();
		int randomChar = random.nextInt(userWord2.length());
		char[] charArray =  userWord2.toCharArray();
		char temp;

		for(int i = 0; i < userWord2.length(); i ++){
			temp = charArray[i];
			charArray[i] = charArray[randomChar];
			charArray[randomChar] = temp;
		}

		System.out.println(charArray);
	}
}

import java.util.*;
public class reverseString {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your string that you want to be reversed");
		String input = reader.next();
		String  strReverse = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			strReverse = strReverse + input.charAt(i);
		}
		System.out.println(strReverse);
	}	
}

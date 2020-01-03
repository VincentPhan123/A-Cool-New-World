import java.lang.Math.*;
import java.util.*;
public class mutiplication {
	public static void main(String args[]) {
		System.out.println("Welcom to a multiplication test!");
		Scanner reader = new Scanner(System.in);
		double score = 10;
		int numOfQuestions = 10;
		boolean win = false;
		boolean lost = false;
		Random random = new Random();
		while(win == false || lost == false) {
			int randNum1 = random.nextInt(16);
			int randNum2 = random.nextInt(16);
			int answer = randNum1 * randNum2;
			System.out.println(answer);
			System.out.println("The equation is:\n" + randNum1 + " x " + randNum2 + " = ");
			int input = reader.nextInt();
			
			if(input == answer) {
				System.out.println("Good Job!");
			}
			else if(input != answer){
				System.out.println("Sorry that was wrong the answer was " + answer);
				--score;
			}

			
			
		}
	}

}

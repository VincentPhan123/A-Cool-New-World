import java.util.*;
import java.util.Random.*;
public class diceGame {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number or sides that will be on your dice.(3-20)\np.s you have two dice");
		int numOfSides1 = reader.nextInt();
		int numOfSides2 = reader.nextInt();
		int dice1 = 0;
		int dice2 = 0;
		rollDice(numOfSides1, numOfSides2, dice1, dice2);
	}
	
	static String createDice(int numOfSides1, int numOfSides2,int dice1, int dice2) {
		Random random = new Random();
		switch(numOfSides1) {
		case 3: dice1 = random.nextInt(4);
		break;
		case 4: dice1 = random.nextInt(5);
		break;
		case 5: dice1 = random.nextInt(6);
		break;
		case 6: dice1 = random.nextInt(7);
		break;
		case 7: dice1 = random.nextInt(8);
		break;
		case 8: dice1 = random.nextInt(9);
		break;
		case 9: dice1 = random.nextInt(10);
		break;
		case 10: dice1 = random.nextInt(11);
		break;
		case 11: dice1 = random.nextInt(12);
		break;
		case 12: dice1 = random.nextInt(13);
		break;
		case 13: dice1 = random.nextInt(14);
		break;
		case 14: dice1 = random.nextInt(15);
		break;
		case 15: dice1 = random.nextInt(16);
		break;
		case 16: dice1 = random.nextInt(17);
		break;
		case 17: dice1 = random.nextInt(18);
		break;
		case 18: dice1 = random.nextInt(19);
		break;
		case 19: dice1 = random.nextInt(20);
		break;
		case 20: dice1 = random.nextInt(21);
		break;
		}
		switch(numOfSides2) {
		case 3: dice2 = random.nextInt(4);
		break;
		case 4: dice2 = random.nextInt(5);
		break;
		case 5: dice2 = random.nextInt(6);
		break;
		case 6: dice2 = random.nextInt(7);
		break;
		case 7: dice2 = random.nextInt(8);
		break;
		case 8: dice2 = random.nextInt(9);
		break;
		case 9: dice2 = random.nextInt(10);
		break;
		case 10: dice2 = random.nextInt(11);
		break;
		case 11: dice2 = random.nextInt(12);
		break;
		case 12: dice2 = random.nextInt(13);
		break;
		case 13: dice2 = random.nextInt(14);
		break;
		case 14: dice2 = random.nextInt(15);
		break;
		case 15: dice2 = random.nextInt(16);
		break;
		case 16: dice2 = random.nextInt(17);
		break;
		case 17: dice2 = random.nextInt(18);
		break;
		case 18: dice2 = random.nextInt(19);
		break;
		case 19: dice2 = random.nextInt(20);
		break;
		case 20: dice2 = random.nextInt(21);
		break;
		}
		String info =  "Your first roll was " + dice1 + "\nYour second roll was " + dice2;
		return info;
	
		}
		
	
	static void rollDice(int numOfSides1, int numOfSides2,int dice1, int dice2) {
		System.out.println(createDice(numOfSides1, numOfSides2, dice1, dice2));
	}

}

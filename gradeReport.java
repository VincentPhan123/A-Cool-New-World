
import java.util.*;
import java.lang.Math.*;

public class Main{

	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your grades: ");
		double g1 = reader.nextInt();
		double g2 = reader.nextInt();
		double g3 = reader.nextInt();
		double g4 = reader.nextInt();
		double g5 = reader.nextInt();
		double g6 = reader.nextInt();
		double g7 = reader.nextInt();
		printInfo(g1, g2, g3, g4, g5, g6, g7);
	}
	

	static String cumulativeAverage(double g1, double g2, double g3, double g4, double g5, double g6, double g7){
		double average = g1 + g2 + g3 + g4 + g5 + g6 + g7;
		double average1 = average / 7;
		String a = "Average: " + average1;
		return a;
	}

	static String getGPA(double g1, double g2, double g3, double g4, double g5, double g6, double g7){
		return "A";
	}

	static boolean honorRoll(double g1, double g2, double g3, double g4, double g5, double g6, double g7){
		double average = g1 + g2 + g3 + g4 + g5 + g6 + g7;
		double average1 = average / 7;
		if (average1 = 80){
			return true;
		}
		else{
			return false;
		}
	}


	static void printInfo(double g1, double g2, double g3, double g4, double g5, double g6, double g7){
		System.out.println(cumulativeAverage(g1, g2, g3, g4, g5, g6, g7));
		System.out.println(honorRoll(g1, g2, g3, g4, g5, g6, g7));
	}
}
/*
Vincent Phan
10/16/19
*/
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Quadratic {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		boolean done = false;
		String input = "";
		int a = random.nextInt(6 + 6)- 6;
		int b = random.nextInt(20 + 20)- 20;
		int c = random.nextInt(15 + 15)- 15;
		String frac1 =  "";
		String frac2 = "";
		System.out.println(getEquation(a,b,c));
		
		while(!done){
			System.out.println("A.Solution");
			System.out.println("B.Equation");
			System.out.println("C.Quit");
			input = reader.next().toUpperCase();

			if(userInput(input) == "newEquation"){
				a = random.nextInt(6 + 6)- 6;
				b = random.nextInt(20 + 20)- 20;
				c = random.nextInt(15 + 15)- 15;
				System.out.println(getEquation(a,b,c));
			}
			else if(userInput(input) == "solution"){
				printInfo(a, b, c, input, frac1, frac2);
			}
			else{
				done = true;
			}
		}
	}
		
	static String getEquation(int a, int b, int c){
		if(b <= -1 && c <= -1){
			String e1 =	a + "x^2 " + b + "x " + c + " = 0";
			return e1;
		}
		else if(b <= -1){
			String e2 = a + "x^2 " + b + "x + " + c + " = 0";
			return e2;
		}
		else if(c <= -1){
			String e3 = a + "x^2 + " + b + "x " + c + " = 0";
			return e3;
		}
		else{
			String e4 = a + "x^2 + " + b + "x + " + c + " = 0";
			return e4;
		}
	}

	static String userInput(String input){
		if(input.equals("A") ){
			return "solution";
		}
		else if(input.equals("B")){
			return "newEquation";
		}
		else{
			return "";
		}
	}
	
	static boolean isPerfectSquare(int a, int b, int c) {
		int perfectSqrt = b*b - 4*a*c;
		double sqrt = Math.sqrt(perfectSqrt);
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	static boolean isComplex(int a, int b, int c){
		double x = b*b - 4*a*c;
		int x1 = (int)x;

		if(x1 <= -1){
			return true;
		}
		else{
			return false;
		}	
	}

	static String isFactorable(int a, int b, int c, String input, String frac1, String frac2){
		if (isPerfectSquare(a, b, c) == false && userInput(input) == "solution" && isComplex(a, b, c) == false){
			double x = b*b - 4*a*c;
			int x1 = (int)x;
			double sqrt = Math.sqrt(x);
			double e1 = (-b + sqrt) / (2.0 * a);
			double e2 = (-b - sqrt) / (2.0 * a);
			String g =  "The equation is not factorable:\n" + b + " - \u221A" + x1 + " / " + "" +  2 * a + " = " + e2 + "\n" + b + " + \u221A" + x1 + " / " + "" +  2 * a + " = " + e1 ;
			return g;
		}
		else if(isPerfectSquare(a, b, c) == false && userInput(input) == "solution" && isComplex(a, b, c) == true){
			double x = b*b - 4*a*c;
			int x1 = (int)x;
			double sqrt = Math.sqrt(x);
			double e1 = (-b + sqrt) / (2.0 * a);
			double e2 = (-b - sqrt) / (2.0 * a);
			String h =  "The equation is not factorable and has complex solutions:\n" + b + " - \u221A" + x1 + "i / " + "" +  2 * a + " = " + e2 + "\n" + b + " + \u221A" + x1 + "i / " + "" +  2 * a + " = " + e1 ;
			return h;
		}
		else if (isPerfectSquare(a, b, c) == true && a != 0 && userInput(input) == "solution"){
			String info = "";
			double x = b*b - 4*a*c;
			double sqrt = Math.sqrt(x); 
			double e1 = (-b + sqrt) / (2.0 * a);
			double e2 = (-b - sqrt) / (2.0 * a);
			int intE1 = (int)e1;
			int intE2 = (int)e2;
			if (e1 == Math.abs(e1) || e1 == 0) {
				frac1 = "true";
			}
			else if(e2 == Math.abs(e2) || e2 == 0){
				frac2 = "true";
			}
			if(frac1 == "true" && frac2 == "true"){
				info = "x = " + intE1 + " and x = " + intE2;
			}
			else if (frac1 == "true"){
				info = "x = " + intE1 + " and x = " + (int)(-b - sqrt) + "/" + (2 * a);
			}
			else if (frac2 == "true"){
				info = "x = " + (int)(-b + sqrt) + "/" + (2 * a) + " and x = " + intE2;
			}
			return info;
		}
		else if (a == 0){
			return "Not a Quadratic.(a = 0)";
		}
		else {
			return "";
		}
	}
	
	static void printInfo(int a, int b, int c, String input, String frac1, String frac2){
		System.out.println(isFactorable(a, b, c, input, frac1, frac2));
	}
}
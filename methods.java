import java.util.*;
import java.lang.Math.*;

public class methods{

	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your cordinates: ");
		double x1 = reader.nextInt();
		double y1 = reader.nextInt();
		double x2 = reader.nextInt();
		double y2 = reader.nextInt();
		printInformation(x1, y1, x2, y2);
	}

	// finds slope
	static String getSlope(double x1,double y1,double x2,double y2){
		double num1 = (y2 - y1);//this sets the numerator
		double den1 = (x2 - x1);//this sets the denomator
		double slope1 = num1 / den1;//finds the slope
		int num2 = (int)num1;
		int den2 = (int)den1;//converts num1 and den1 into integers
		String slope = "Slope: " + slope1 + " or " + num2 + "/" + den2;//prints the slope
		return slope;
	}

	//finds the distance between the points
	static String getDistance(double x1, double y1, double x2, double y2){
		double d1 = (x2 - x1);
		double EXd1 = Math.pow(d1, 2);
		double d2 = (y2 - y1);
		double EXd2 = Math.pow(d2, 2);
		double d3 = (EXd1 + EXd2);
		double distance1 = Math.sqrt(d3);
		String distance2 = "sqrt(" + d3 + ")";
		String distance ="Distance: " + distance1 + " or " + distance2;
		return distance;
	}
    //finds the yint equation
	static String getEquation(double x1, double y1, double x2, double y2){
		double num = (y2 - y1);
		double den = (x2 - x1);
		double slope = (num / den);
		double yInt = (y1 -= slope * x1);
		String s = "Equation: y = " + slope + "x + " + yInt;
		return s;
	}
    //finds midpoint
	static String getMidpoint(double x1, double y1, double x2, double y2){
		double m1 = ((x1 + x2) / 2);
		double m2 = ((y1 + y2) / 2);
		int m3 = (int)m1;
		int m4 = (int)m2;
		String mp = "Midpoint: (" + m3 + "," + m4 + ")";
		return mp;
	}
    //print info
	static void printInformation(double x1, double y1, double x2, double y2){
		System.out.println(getDistance(x1, y1, x2, y2));
		System.out.println(getSlope(x1, y1, x2, y2));
		System.out.println(getEquation(x1, y1, x2, y2));
		System.out.println(getMidpoint(x1, y1, x2, y2));
	}
}

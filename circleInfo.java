import java.util.*;
import java.util.Random.*;
import java.lang.Math.*;
public class circleInfo {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the radius of you circle");
		double radius = reader.nextDouble();
		printInfo(radius);
	}
	static String getArea(double radius) {
		double area = radius * radius * Math.PI;
		String info = "The area is " + area;
		return info;
	}
	static String getCircum(double radius) {
		double circum = 2 * Math.PI * radius;
		String info = "The circumference is: " + circum;
		return info;
	}
	static void printInfo(double radius) {
		 System.out.println(getArea(radius));
		 System.out.println(getCircum(radius));
	}

}

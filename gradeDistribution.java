import java.util.Random;

public class gradeDistribution {
	static void gradeCounter() {
		int numGrades;
		int count = 0;
		int grade;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		Random random = new Random();
		numGrades = random.nextInt(30 + 20) + 20;
		
		while(count < numGrades) 
			{
			grade = random.nextInt(100 - 30) + 30;
			
			if(grade >= 90) {
				++a;
				++count;
			}
			else if(grade >= 80) {
				++b;
				++count;
			}
			else if(grade >= 70) {
				++c;
				++count;
			}
			else if(grade >= 60) {
				++d;
				++count;
			}
			else {
				++f;
				++count;
			}
			}
		System.out.println("Grade Report:\nAs: " + a + "\nBs: " + b + "\nCs: " + c + "\nDs: " + d + "\nFs: " + f);
	}
	
	public static void main(String[] args) {
		gradeCounter();
	}
}
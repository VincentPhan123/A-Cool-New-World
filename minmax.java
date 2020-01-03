import java.util.Random;

public class minMax {
	public static void main(String args[]) {
		Random random = new Random();
		int x1 = random.nextInt(1000 + 1) + 1;
		int x2 = random.nextInt(1000 + 1) + 1;
		int x3 = random.nextInt(1000 + 1) + 1;
		System.out.println(x1 + " " + x2 + " " + x3);
		System.out.println(max(x1, x2, x3));
		System.out.println(min(x1, x2, x3));
		System.out.println(maxMin5(x1, x2, x3, random));
	}
	
	static int max(int x1, int x2, int x3) {
		int max = Math.max(Math.max(x1, x2), x3);
		return (int)max;
	}
	
	static int min(int x1, int x2, int x3) {
		int min = Math.min(Math.min(x1, x2), x3);
		return (int)min;
	}
	
	static String maxMin5(int x1, int x2, int x3,Random random) {
		int m1 = random.nextInt(1000 + 1) + 1;
		int m2 = random.nextInt(1000 + 1) + 1;
		int m3 = random.nextInt(1000 + 1) + 1;
		int m4 = random.nextInt(1000 + 1) + 1;
		int m5 = random.nextInt(1000 + 1) + 1;
		String listOfNum = m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5;
		String max = "";
		String min = "";
		
		if(max(m1, m2, m3) == m1 && max(m1, m4, m5) == m1) {
			max = "" + m1;
		}
		else if(max(m1, m2, m3) == m2 && max(m2, m4, m5) == m2) {
			max = "" + m2;
		}
		else if(max(m1, m2, m3) == m3 && max(m3, m4, m5) == m3) {
			max = "" + m3;
		}
		else if(max(m4, m2, m3) == m4 && max(m1, m4, m5) == m4) {
			max = "" + m4;
		}
		else if(max(m5, m2, m3) == m5 && max(m1, m4, m5) == m5) {
			max = "" + m5;
		}
		
		if(min(m1, m2, m3) == m1 && min(m1, m4, m5) == m1) {
			min = "" + m1;
		}
		else if(min(m1, m2, m3) == m2 && min(m2, m4, m5) == m2) {
			min = "" + m2;
		}
		else if(min(m1, m2, m3) == m3 && min(m3, m4, m5) == m3) {
			min = "" + m3;
		}
		else if(min(m4, m2, m3) == m4 && min(m1, m4, m5) == m4) {
			min = "" + m4;
		}
		else if(min(m5, m2, m3) == m5 && min(m1, m4, m5) == m5) {
			min = "" + m5;
		}
		
		return listOfNum + "\nMax: " + max + "\nMin: "+ " " + min;

	
		
	}
}


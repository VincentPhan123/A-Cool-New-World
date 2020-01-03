import java.util.Scanner;
import java.util.Random;
public class arrayPractice {
	public static void main(String[] args) {
		int array[] = new int[]{1,2,3,4,5};
		printArray(array);
		System.out.println(" ");
		getMax(array);
		getMin(array);	
		randomArray();
	}
	static void printArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	static void getMax(int[] array){ 
	    int maxValue = array[0]; 
	    for(int i=1;i < array.length;i++){ 
	      if(array[i] > maxValue){ 
	         maxValue = array[i]; 
	      } 
	    } 
	    System.out.println
	    ("Max value: " + maxValue); 
	  }
	
	 static void getMin(int[] array){ 
	    int minValue = array[0]; 
	    for(int i=1;i< array.length;i++){ 
	      if(array[i] < minValue){ 
	        minValue = array[i]; 
	      } 
	    } 
	    System.out.println("Min Value: " + minValue); 
	}
	 
	 static void randomArray() {
		 Random random = new Random();
		 boolean done = false;
		 
		 int array[] = new int[99];
		 while(!done) {
			 int randomNum = random.nextInt(99);
			 for(int i = 0; i < array.length; i++) {
				array[i] = randomNum;
				if(array.length == 99) {
					done = true;
				}
			 }
			 
			 printArray(array);
		 }
	 }
}
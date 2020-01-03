import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int array[] = new int[]{1,2,3,4,5,1};
		printArray(array);
		System.out.println(" ");
		getMax(array);
		getMin(array);	
		randomArray();
		mmm(array);
		userNum(array);
		sortedArray();
		replace();
		delete();
		shuffle();
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
	    System.out.println("Max value: " + maxValue); 
	  }
	
	 static void getMin(int[] array){ 
	    int minValue = array[0]; 
	    for(int i=1;i< array.length;i++){ 
	      if(array[i] < minValue){ 
	        minValue = array[i]; 
	      } 
	    } 
	    System.out.println("Min Value: " + minValue + "\n----------------------"); 
		}
	 
	 static void randomArray() {
		 Random random = new Random();
		 boolean done = false;
		 
		 int array[] = new int[99];
		 while(!done) {
			 int randomNum = 0;
			 for(int i = 0; i < array.length; i++) {
				randomNum = random.nextInt(99);
				array[i] = randomNum;
				if(array.length == 99) {
					done = true;
				}
			 }
			 
			 printArray(array);
		 }
	 }

	 static void mmm(int [] array){
		 int mean = 0;
		 for(int i = 0; i < array.length; i++){
				mean += array[i];
		 }
		 int len = array.length;
		 System.out.println( "\n--------------" + "\nMean: " + mean / len);

		 int middle = array.length/2;
     if (array.length%2 == 1) {
      	System.out.println("Median: " + array[middle]);
    	}else{
        System.out.println("Median: " + (array[middle-1] + array[middle]) / 2.0);
    	}

		 int maxValue = 0 , maxCount = 0;

     for (int i = 0; i < array.length; ++i) {
        int count = 0;
        for (int j = 0; j < array.length; ++j) {
          if (array[j] == array[i]) ++count;
        }
        if (count > maxCount) {
          maxCount = count;
          maxValue = array[i];
        }
    }
			System.out.println("Mode: " + maxValue + "\n-----------------");

	 }

	 static void userNum(int [] array){
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Enter the number you would like to look for.");
		 int num = reader.nextInt();
     int index = 0;
		 for(int i = 0; i < array.length; i++){
			 if(array[i] == num){
				 index = i;
			 }else{
				 index = -1;
			 }
		 }
		 System.out.println(index + "\n-----------");
	 }

	 static void sortedArray(){
		 Random rand = new Random();
		 int num = 0;
		 int [] array = new int [5];
		 
		 for(int i = 0; i < array.length; i++){
			 num = rand.nextInt(100);
			 array[i] = num;
		 }
		 System.out.println("OG Array:");
		 printArray(array);
		 System.out.println("\n");
		 Arrays.sort(array);
		 printArray(array);
     int temp = 0;
  	 for(int i=0; i<= array.length - 1 ; i++){
      for( int j=0; j<= array.length - 2; j++){
        if(array[j] < array[j+1]){
        	temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
       	 }
    	}
  	}
		System.out.println("\n");
		printArray(array);
		System.out.println("\n-------------------");
	 }

	 static void replace(){
		 Scanner reader = new Scanner(System.in);
		 int [] array = {1,2,3,4,5};
		 printArray(array);
		 System.out.println("\nEnter your number.");
		 int num = reader.nextInt();
		 System.out.println("Enter your index.");
		 int index = reader.nextInt();
		 for(int i = 0; i < array.length; i++){
			 if(i == index){
				 array[i] = num;
			 }
		 }
		 printArray(array);
		 System.out.println("\n----------------");
	 }

	 static void delete(){
		Scanner reader = new Scanner(System.in);
		int [] array = {1,2,3,4,5};
		printArray(array);
    System.out.print("\nEnter element to be deleted: ");
  	int num = reader.nextInt();
        
    for(int i = 0; i < array.length; i++){
      if(array[i] ==num){
              
      for(int j = i; j < array.length - 1; j++){
        array[j] = array[j+1];
      }
      break;
    	}
  	}	 
      
    printArray(array);
		System.out.println("\n--------------");
	 }

	 static void shuffle(){
		 Random rand = new Random();
		 int [] array = {1,2,3,4,5};
		
		 printArray(array);
		
		 for (int i = 0; i < array.length; i++) {
			int random = rand.nextInt(array.length);
			int temp = array[random];
			array[random] = array[i];
			array[i] = temp;
			}
		 System.out.println("\n");
		 printArray(array);
	 }
}
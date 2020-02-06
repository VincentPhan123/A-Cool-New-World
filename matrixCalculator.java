import java.util.*;

public class matrixCalculator{
   public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("WELCOME TO MY MATRIX CALCULATOR!\n~~~~~~~~~~~~~~~~~");
        System.out.println("Create your first matrix\n~~~~~~~~~~~~~~~~");
        int [][] matrix1 = new int [0][0];
        makeMatrix(matrix1, reader);
        System.out.println("Create your second matrix\n~~~~~~~~~~~~~~~~");
        int [][] matrix2 = new int [0][0];
        makeMatrix(matrix2, reader);
        //System.out.println(areCompatiable(matrix1, matrix2));
    }

   	static void menu(int [][] matrix1, int [][] matrix2, Scanner reader) {
   		boolean done = false;
	   	while(!done){
	        System.out.println("MENU\n----\n1)ADD MATRICES\n2)SUBTRACT MATRICES\n3)MULTIPLY MACTICES\n4)FIND DETERMINANT\n5)QUIT");
	        int input = reader.nextInt();
	        if(input == 1){
	            System.out.println(addMatrix(matrix1, matrix2));
	            menu(matrix1, matrix2, reader);
	        }else if(input == 2){
	            System.out.println(subMatrix(matrix1, matrix2));
	            menu(matrix1, matrix2, reader);
	        }else if(input == 3){
	            System.out.println(mulMatrix(matrix1, matrix2));
	            menu(matrix1, matrix2, reader);
	        }else if(input == 4){
	            System.out.println(findDeterminant(matrix1, matrix2));
	            menu(matrix1, matrix2, reader);
	        }else{
	            done = true;
	        }
	   	}
   	}
   
    static void printMatrix(int [][] arr){
        for(int rows = 0; rows < arr.length; rows++){
            for(int cols = 0; cols < arr[rows].length; cols++){
                System.out.printf("%-10s", arr[rows][cols]);
            }
            System.out.println();
        }
    }

    /*
    static boolean areCompatiable(int[][] matrix1, int[][] matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length; 
        int col2 = matrix2[0].length;
        if(row1 == row2 && col1 == col2){
            return true;
        }else{
            return false;
        }
        
    }
    */

    static void makeMatrix(int[][] matrix, Scanner reader) {
    	System.out.println("Enter number of rows: ");
        int rows = reader.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = reader.nextInt();
        matrix = new int [rows][cols];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Enter the value for [" + i + "][" + j + "]: ");
                  int value = reader.nextInt();
                  matrix[i][j] = value;
            }
        }
        printMatrix(matrix);
    }

    static int addMatrix(int[][] matrix1, int [][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return 0;
        }else{
            return 1;
        }
    }

    static int subMatrix(int[][] matrix1, int [][] matrix2){
        return 0;
    }

    static int mulMatrix(int[][] matrix1, int [][] matrix2){
        return 0;
    }

    static int findDeterminant(int[][] matrix1, int [][] matrix2){
        return 0;
    }

    
}

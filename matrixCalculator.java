import java.util.*;

public class matrixCalculator{
   public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("WELCOME TO MY MATRIX CALCULATOR!\n~~~~~~~~~~~~~~~~~");
        System.out.println("Create your first matrix\n~~~~~~~~~~~~~~~~");
        int [][] matrix1 = new int [0][0];
        matrix1 = makeMatrix(matrix1, reader);
        printMatrix(matrix1);
        System.out.println("Create your second matrix\n~~~~~~~~~~~~~~~~");
        int [][] matrix2 = new int [0][0];
        matrix2 = makeMatrix(matrix2, reader);
        printMatrix(matrix2);
        menu(matrix1, matrix2, reader);
    }

   	static void menu(int [][] matrix1, int [][] matrix2, Scanner reader) {
           boolean done = false;
           int [][] sum = new int [0][0];
           int [][] difference = new int [0][0];
           int [][] product = new int [0][0];
	   	while(!done){
	        System.out.println("MENU\n----\n1)ADD MATRICES\n2)SUBTRACT MATRICES\n3)MULTIPLY MACTICES\n4)FIND DETERMINANT\n5)QUIT");
	        int input = reader.nextInt();
	        if(input == 1){
                addMatrix(matrix1, matrix2);
                sum = addMatrix(matrix1, matrix2);
                printMatrix(sum);
	            menu(matrix1, matrix2, reader);
	        }else if(input == 2){
                subMatrix(matrix1, matrix2);
                difference = subMatrix(matrix1, matrix2);
                printMatrix(difference);
	            menu(matrix1, matrix2, reader);
	        }else if(input == 3){
                mulMatrix(matrix1, matrix2);
                product = mulMatrix(matrix1, matrix2);
                printMatrix(product);
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

    static boolean canMultiply(int[][] matrix1, int[][] matrix2){
        int col1 = matrix1[0].length;
        int row2 = matrix2.length; 
        if(col1 == row2){
            return true;
        }else{
            return false;
        }
    }
    

    static int[][] makeMatrix(int[][] matrix1,Scanner reader) {
    	System.out.println("Enter number of rows: ");
        int rows = reader.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = reader.nextInt();
        matrix1 = new int [rows][cols];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                System.out.println("Enter the value for [" + i + "][" + j + "]: ");
                  int value = reader.nextInt();
                  matrix1[i][j] = value;
            }
        }
        return matrix1;
    }

    static int [][] addMatrix(int[][] matrix1, int [][] matrix2){
        int [][] sumMatrix = new int [matrix1.length][matrix1[0].length];
        if(areCompatiable(matrix1, matrix2) == true){
            for(int rows = 0; rows < matrix1.length; rows++){
                for(int cols = 0; cols < matrix1[0].length; cols++){
                    sumMatrix[rows][cols] = matrix1[rows][cols] + matrix2[rows][cols];
                }
            }
            return sumMatrix;
        }else{
            sumMatrix = new int [2][2];
            for(int i = 0; i < sumMatrix.length; i++){
                for(int j = 0; j < sumMatrix[0].length; j++){
                    sumMatrix[i][j] = -1;
                }
            }
            return sumMatrix;
        }
    }

    static int [][] subMatrix(int[][] matrix1, int [][] matrix2){
        int [][] differenceMatrix = new int [matrix1.length][matrix1[0].length];
        if(areCompatiable(matrix1, matrix2) == true){
            for(int rows = 0; rows < matrix1.length; rows++){
                for(int cols = 0; cols < matrix1[0].length; cols++){
                    differenceMatrix[rows][cols] = matrix1[rows][cols] - matrix2[rows][cols];
                }
            }
            return differenceMatrix;
        }else{
            differenceMatrix = new int [2][2];
            for(int i = 0; i < differenceMatrix.length; i++){
                for(int j = 0; j < differenceMatrix[0].length; j++){
                    differenceMatrix[i][j] = -1;
                }
            }
            return differenceMatrix;
        }
    }

    static int[][] mulMatrix(int[][] matrix1, int [][] matrix2){
        int [][] productMatrix = new int [matrix1.length][matrix2[0].length];
        int [][] mismatched = {{-1, -1}, {-1,-1}};
        
        if(canMultiply(matrix1, matrix2) == true){
            for(int rows = 0; rows < matrix1.length; rows++) {
                for (int cols2 = 0; cols2 < matrix2[0].length; cols2++) {
                    for (int cols1 = 0; cols1 < matrix1[0].length; cols1++) {
                        productMatrix[rows][cols2] += matrix1[rows][cols1] * matrix2[cols1][cols2];
                    }
                }
            }
            return productMatrix;
        }else{
            return mismatched;
        }
    }

    static int findDeterminant(int[][] matrix1, int [][] matrix2){
        int determinant = 0;
        return determinant;
        
    }
}

import java.util.Random.*;
import java.util.*;

public class Main{
	public static void main(String args[]) {
		int rows = 12;

		for(int i = 1; i <= rows; ++i){
			for(int j = 1; j <= 12; ++j){
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}


	}
}

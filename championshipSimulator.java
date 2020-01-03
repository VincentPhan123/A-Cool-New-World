import java.util.*;
import java.util.Random.*;

public class Main{
	static void gameSimulator(){
			Scanner reader = new Scanner(System.in);
			boolean done = false;	
			Random random = new Random();
			int win = 0;
			int teamWin1 = 0;
			int teamWin2 = 0;
			int winChance = 0;
			int game = 7;
			String userInput = "";

			System.out.println("Enter your first NBA team:");
			String firstTeam = reader.next();
			System.out.println("Enter your second NBA team:");
			String secondTeam = reader.next();
			System.out.println("Enter the percent win chance for the first team:");
			int userChance = reader.nextInt();
			
			if(userChance <= 100 && userChance >= 90) {
				winChance = random.nextInt(100 - 90) + 90;
			}else if(userChance <= 90 && userChance >= 80) {
				winChance = random.nextInt(90 - 80) + 80;
			}else if(userChance <= 80 && userChance >= 70) {
				winChance = random.nextInt(80 - 70) + 70;
			}else if(userChance <= 70 && userChance >= 60) {
				winChance = random.nextInt(70 - 60) + 60;
			}else if(userChance <= 60 && userChance >= 50) {
				winChance = random.nextInt(60 - 50) + 50;
			}else if(userChance <= 50 && userChance >= 40) {
				winChance = random.nextInt(50 - 40) + 40;
			}else if(userChance <= 40 && userChance >= 30) {
				winChance = random.nextInt(40 - 30) + 30;
			}else if(userChance <= 30 && userChance >= 20) {
				winChance = random.nextInt(30 - 20) + 20;
			}else if(userChance <= 20 && userChance >= 10) {
				winChance = random.nextInt(20 - 10) + 10;
			}else if(userChance <= 10 && userChance >= 0) { 
				winChance = random.nextInt(10 - 1) + 1;
			}
			while(!done){
				win = random.nextInt(101);

				if(winChance >= win){
					++teamWin1;
					--game;
					System.out.println(firstTeam + " won!\n" + firstTeam + " have " + teamWin1 + " win. There are " + game + " games left.\nDo you want to simulate the next game?(YES or NO)");
					userInput = reader.next().toUpperCase();
				}else{
					++teamWin2;
					--game;
					System.out.println(secondTeam + " won!\n" + secondTeam + " has " + teamWin2 + " win. There are " + game + " games left" + "\nDo you want to simulate the next game?(YES or NO)");
					userInput = reader.next().toUpperCase();
				}
				if(userInput == "YES"){
					if(teamWin1 == 4 && teamWin2 == 0){
						System.out.println("The " + firstTeam + " SWEPT THE " + secondTeam + "!!!");
						done = true;
					}else if(teamWin1 >= 4 && teamWin2 <= 3){
						System.out.println("The " + firstTeam + " won the CHAMPIONSHIP!!!");
						done = true;
					}else if(teamWin2 == 4 && teamWin1 == 0){
						System.out.println("The " + secondTeam + " SWEPT THE " + firstTeam + "!!!");
						done = true;
					}else if(teamWin2 >= 4 && teamWin1 <= 3){
						System.out.println("The " + secondTeam + " won the CHAMPIONSHIP!!!");
						done = true;
					}
				}else{
					done = true;
				}
			}
	}
	
	static void gameRunner(){
	//this method should gather all of the data needed to run gameSimulator()		
		gameSimulator();
	}
		
	public static void main(String[] args) {
			gameRunner();
	}
}
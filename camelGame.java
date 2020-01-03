import java.util.Random;
import java.util.Scanner;
/**
 * Created by Vincent Phan on 10/7/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to camel!");
        System.out.println("You have stolen a camel to make your way across the great Mobi desert.");
        System.out.println("The natives want their camel back and are chasing you down!");
        System.out.println("Survive your desert trek and out run the natives.");//prints the message in the perenthesis

        Random random = new Random();//creats our random package
        String userChoice;//intilazies the userChoice as a string
        boolean done = false;//intilazies done as boolean and declares it as false
        int milesTraveled = 0;
        int thirst = 0;
        int camelTiredness = 0;
        int nativesDistance = -20;
        int drinks = 3;
				int daysTraveled = 0;
				int thirstLvl = 0;
        // these lines of code intilazies our variables as integers and declares it as the numbers it is equal to
     
        		
        		
        while (!done) {
					//this loop will continue until done is true.
        	int dice = random.nextInt(7);
        	int sandStorm =  random.nextInt(11);
          int merchant = random.nextInt(11);
          int genie = random.nextInt(101);
					//these lines of code intilazies the varibales and saves a random number in them
     
            
          System.out.println();
          System.out.println("A. Drink from your canteen.");
					System.out.println("B. Ahead slow speed.");
          System.out.println("C. Ahead moderate speed.");
          System.out.println("D. Ahead full speed.");
          System.out.println("E. Stop for the night.");
          System.out.println("F. Status check.");
          System.out.println("G. Quit.");
					//these lines of code prints the text in the parentheses
            
					System.out.print("Enter your choice: ");
          userChoice = scanner.nextLine().toUpperCase();
					//this takes the user's first string makes it uppercase and saves it in userChoice variable
          System.out.println();

          if (userChoice.equals("G")) {
              done = true;
							//if the user choses G then the loop is complete and the program stops
          } else if (userChoice.equals("F")) {
              System.out.println("Miles traveled: " + milesTraveled);
              System.out.println("Drinks in canteen: " + drinks);
              System.out.println("The natives are " + (milesTraveled - nativesDistance) + " miles behind you.");
							System.out.println("You have traveled for " + daysTraveled + " days");
							System.out.println("Your camel's level of Stamina: " + camelTiredness);
							System.out.println("Your thirst level is: " + thirstLvl);
							//if the user choses F then is prints out the status check 
          } else if (userChoice.equals("E")) {
              camelTiredness = 0;
              System.out.println("The camel is happy.");
              nativesDistance += (int)(Math.random() * 8) + 7;
							daysTraveled++;
							//if the user choses E then the user will rest, the naticesDistance will increase, increments the daysTraveled variable, and resets the camel's stamina 
          } else if (userChoice.equals("D")) {
              int distance = (int)(Math.random() * 11) + 10;
              System.out.println("You traveled " + distance + " miles.");
              milesTraveled += distance;
              thirst++;
              camelTiredness += (int)(Math.random() * 3) + 1;
              nativesDistance += (int)(Math.random() * 8) + 7;
							thirstLvl++;
							// if the user chose D then the user will travel at the max speed and generates a random distance that will be added to miles traveled, increments thirst, it increase the camel's tiredness buy a random number between 3 and 1, generates a random number between 8 - 7 for nativesDistance, and increments thirstLvl. 
          } else if (userChoice.equals("C")) {
              int distance = (int)(Math.random() * 8) + 5;
              System.out.println("You traveled " + distance + " miles.");
              thirst++;
              camelTiredness++;
							thirstLvl++;
              nativesDistance += (int)(Math.random() * 8) + 7;
							camelTiredness += (int)(Math.random() * 3) + 1;
							//if the user choses C then the user will travel at medium speed, increments thirst, camelTirdness, thirstLvl, decrements camelStamina, generates a random number between 8 - 5 for distance, and generates a random number to be saved in nativesDistance,
					} else if (userChoice.equals("B")){
						int distance = (int)(Math.random() * 6) + 4;
						System.out.println("You have traveled " + distance + " miles.");
						nativesDistance += (int)(Math.random() * 8) + 7;
						//if the user choses B then they will travel at the slowest speed they would not lose any thirst, tiredness, or camelTirdenss, it will generate a random numbere between 6 - 4, and it will generate a random number between 8-7 for the nativeDistance
          } else if (userChoice.equals("A")) {
              if (drinks > 0) {
                  drinks--;
                  thirst = 0;
									thirstLvl = 0;
									//if A is chosen then it will reset all the thirst variable back to 0 and will decrement drinks if drinks is greater than 0
              } else {
                  System.out.println("You do not have enough drinks remaining.");
									//if there is not enough drinks then it will print the text in the parentheses
                }
					}


           if (thirst > 6) {
              done = true;
              System.out.println("You died of thirst");
							//if thirst is greater than 6 the user loses the game and prints the text in the parentheses
          } else if (thirst > 4) {
              System.out.println("You are thirsty.\nIt becomes hard for you to tell reality from fantasy!");
              int mirage = random.nextInt(8);
              if(mirage == 5) {
                System.out.println("You see a grand buffet and make a beeline to it!\nOH NO! It was just a mirage!");
                camelTiredness = 4;
                drinks = 1;
							/* if thirst is greater than 4 then the program will print 'You are thirsty'
							'It becomes hard for you to tell reality from fantasy!'
							it also has a chance of generating a mirage event that will cause the user to lose drinks and decrases camelStamina and increase camelTiredness
							*/
                }
            }

          if (camelTiredness > 8) {
              done = true;
              System.out.println("Your camel is dead.");
          } else if (camelTiredness > 5) {
              System.out.println("Your camel is getting tired.");
           }
					 //if the variable camelTiredness greater than 8 the camel dies and the user loses the game and if camelTiredness is greater than 5 the program notifies the user that the camel is getting tired

          if (milesTraveled - nativesDistance <= 0) {
              done = true;
              System.out.println("The natives have caught you!");
							//this checks to see if the natives have caught the user
          } else if (milesTraveled - nativesDistance <= 15) {
              System.out.println("The natives are getting close!");
							//this checks to see if the natives are getting close 
          }

          if (milesTraveled >= 200) {
              System.out.println("You have made it across the desert! You won!");
              done = true;
						//this checks to see if the user has won 
          }

          if ((int) (Math.random() * 20) == 0) {
              System.out.println("You found an oasis!");
              drinks = 3;
              thirst = 0;
              camelTiredness = 0;
							thirstLvl--;
							//this randomly generates the oasis event. If the user gets the oasis their supplies will be replenished
            }
          if(sandStorm == 5) {
            System.out.println("Oh no you are caught in a sand storm!");
            thirst++;
            drinks--;
						thirstLvl++;
						//this randomly generates a sandomstorm event if the user if caught in one they will drinks, and their thirst will go up.
            }
          if(merchant == 2) {
            System.out.println("You found a merchant!\nHe gave you gifts!");
            drinks = 3;
            camelTiredness = 0;
            thirst = 0;
						thirstLvl--;
						//this randomly generates a merchant event and if the user gets the merchant event then their supplies will be replienished
            	}
          if(genie == 16) {
            done = true;
            System.out.println("You found a genie and he helps you!\nHe teleports you a safe distance away from the natives!");
						//this randomly generates the genie event and will automatacly give the user a win
            }
            	
            }  
        }
    }
import java.util.*;

public class vendingMachine{
    private Items [][] vendingMachine = new  Items[5][3];
    private double machineMoney = 50;
    private double wallet = 5;

    public vendingMachine(Items [][] a){
    	this.vendingMachine = a;
    	
    	vendingMachine[0][0] = new Items ("Ratatouille", 2);
    	vendingMachine[0][1] = new Items ("Pizza Planet's Pizza", 1.50);
    	vendingMachine[0][2] = new Items ("B.D's Bath Water", 2);
    	vendingMachine[1][0] = new Items ("Jolly Ranchers", 1);
    	vendingMachine[1][1] = new Items ("Gummy Bears", 1.25);
    	vendingMachine[1][2] = new Items ("Ramen Ichiraku's Ramen", 2);
    	vendingMachine[2][0] = new Items ("Pho In A Cup", .25);
    	vendingMachine[2][1] = new Items ("Greg's Egg Rolls", .15);
    	vendingMachine[2][2] = new Items ("Usinger's Bratwurts", .50);
    	vendingMachine[3][0] = new Items ("Water Sheep's Lambchop", 2);
    	vendingMachine[3][1] = new Items ("Amy's Angel Cake", 2);
    	vendingMachine[3][2] = new Items ("Tacos On A Stick", 1.50);
    	vendingMachine[4][0] = new Items ("Betty's Brownies", .50);
    	vendingMachine[4][1] = new Items ("Benny's Burritos", .25);
    	vendingMachine[4][2] = new Items ("Totoro's Tuna", 1.25);
        
        question(vendingMachine, machineMoney, wallet);
        
    }

    static void question(Items [][] vendingMachine, double machineMoney, double wallet){
        Scanner reader = new Scanner(System.in);
        boolean done = false;
        String input = "";
        double change = 0;
        double remaining = 1;

        
            getVendingMachine(vendingMachine);
            System.out.println("Please Enter Your Selection: \n(One Number At A Time)");
            int s1 = reader.nextInt();
            int s2 = reader.nextInt();
            
            
                System.out.println("Please Enter You Money: \n| D - $1 | Q - $.25 | d - $0.10 | N - $0.05|\n(Max $2)\n" + vendingMachine[s1][s2].items + " - " + vendingMachine[s1][s2].price);
                System.out.println("Wallet: " + wallet);
                double m = moneyInput();
            
                while(!done){
                    if(m == vendingMachine[s1][s2].price && m < machineMoney && wallet > 0 && vendingMachine[s1][s2].quantity > 0){
                        System.out.println("Thank You! Here is your " + vendingMachine[s1][s2].items);
                        wallet -= m;
                        --vendingMachine[s1][s2].quantity;
                        machineMoney += m;
                        System.out.println("Would you like to purchase more items?\nY or N");
                        input = reader.next().toUpperCase();
                        if(input.equals("Y")){
                            question(vendingMachine, machineMoney, wallet);
                        }else{
                            System.out.println("Thank You For You Business!");
                            done = true;
                        }
                    }else if(m < vendingMachine[s1][s2].price && m < machineMoney && wallet > 0 && vendingMachine[s1][s2].quantity > 0){
                        remaining = vendingMachine[s1][s2].price - m;
                        wallet -= m;
                        machineMoney += m;
                        System.out.println("Insufficent Funds. You Owe: " + remaining + "\n| D - $1 | Q - $.25 | d - $0.10 | N - $0.05|\n");
                        m = moneyInput();
                        wallet -= m;
                        machineMoney += m;
                        remaining -= m;
                        if(remaining == 0){
                            System.out.println("Thank You! Here is your " + vendingMachine[s1][s2].items);
                            machineMoney += m;
                            wallet -= m;
                            System.out.println("Would you like to purchase more items?\nY or N");
                            input = reader.next().toUpperCase();
                            if(input.equals("Y")){
                                question(vendingMachine, machineMoney, wallet);
                            }else{
                                System.out.println("Thank You For You Business!");
                                done = true;
                            }
                        }else if(remaining < 0){
                            machineMoney += m;
                            wallet -= m;
                            change = remaining + m;
                            wallet += change;
                            machineMoney -= change;
                            System.out.println("Thank You! Here is your " + vendingMachine[s1][s2].items + "\nChange: " + change);
                            System.out.println("Would you like to purchase more items?\nY or N");
                            input = reader.next().toUpperCase();
                            if(input.equals("Y")){
                                question(vendingMachine, machineMoney, wallet);
                            }else{
                                System.out.println("Thank You For You Business!");
                                done = true;
                            }
                        }
                    }else if(m > vendingMachine[s1][s2].price && m < machineMoney && wallet > 0 && vendingMachine[s1][s2].quantity > 0){
                        change = m - vendingMachine[s1][s2].price;
                        wallet += change;
                        wallet -= m; 
                        machineMoney -= change;
                        machineMoney += m;
                        --vendingMachine[s1][s2].quantity;
                        System.out.println("Thank You! Here is your " + vendingMachine[s1][s2].items + "\nChange: " + change);
                        System.out.println("Would you like to purchase more items?\nY or N");
                        input = reader.next().toUpperCase();
                        if(input.equals("Y")){
                            question(vendingMachine, machineMoney, wallet);
                        }else{
                            System.out.println("Thank You For You Business!");
                            done = true;
                        }
                    }else if(vendingMachine[s1][s2].quantity <= 0){
                        System.out.println("Sorry that item is out of stock. Please choose a different item");
                        question(vendingMachine, machineMoney, wallet);
                    }
                }
            }

    static void getVendingMachine(Items [][] vendingMachine){
        for(int rows = 0; rows < vendingMachine.length; rows++){
            for(int cols = 0; cols < vendingMachine[0].length; cols++){
                System.out.printf("%-10s", "[" + rows + "]" + "[" + cols + "]" + vendingMachine[rows][cols].items + " - " + vendingMachine[rows][cols].price + " " + vendingMachine[rows][cols].quantity);
            }
            System.out.println();
        }
    }

    static double moneyInput(){
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        double m = 0;

        if(input.equals("D")){
            m = 1;
        }else if(input.equals("Q")){
            m = .25;
        }else if(input.equals("d")){
            m = .1;
        }else if(input.equals("N")){
            m = .05;
        }
        return m;
    }

    

}

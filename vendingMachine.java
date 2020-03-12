import java.util.*;
public class VendingMachine{
    private VendingMachine [][] vendingMachine = new VendingMachine[5][3];
    private double money;

    public VendingMachine(VendingMachine [][] a, double m){
        this.vendingMachine = a;
        this.money = m;

        a[0][0] = new Item ("Ratatouille", 2);
        a[0][1] = new Item ("Pizza Planet's Pizza", 1.50);
        a[0][2] = new Item ("B.D's Bath Water", 2);
        a[1][0] = new Item ("Jolly Ranchers", 1);
        a[1][1] = new Item ("Gummy Bears", 1.25);
        a[1][2] = new Item ("Ramen Ichiraku's Ramen", 2);
        a[2][0] = new Item ("Pho In A Cup", .25);
        a[2][1] = new Item ("Greg's Egg Rolls", .15);
        a[2][2] = new Item ("Usinger's Bratwurts", .50);
        a[3][0] = new Item ("Water Sheep's Lambchop", 2);
        a[3][1] = new Item ("Amy's Angel Cake", 2);
        a[3][2] = new Item ("Tacos On A Stick", 1.50);
        a[4][0] = new Item ("Betty's Brownies", .50);
        a[4][1] = new Item ("Benny's Burritos", .25);
        a[4][2] = new Item ("Totoro's Tuna", 1.25);
         
        for(int rows = 0; rows < a.length; rows++){
            for(int cols = 0; cols < a[0].length; col++){
                System.out.printf("%-10s", a[rows][cols]);
            }
        }
    }

    /*
    public static void getVendingMachine(){
        for(int rows = 0; rows < a.length; rows++){
            for(int cols = 0; cols < a[0].length; col++){
                System.out.printf("%-10s", a[rows][cols]);
            }
        }
    }
    */
}

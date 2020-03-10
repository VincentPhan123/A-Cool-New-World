import java.util.*;
public class VendingMachine{
    private Item [][] vendingMachine = Item(n,d);
    private double money;

    public VendingMachine(int [][] a, double m){
        this.vendingMachine = a;
        this.money = m;
        Random rand = new Random();
        m = rand.nextInt(100);
    }
}
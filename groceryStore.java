import java.util.*;
public class groceryStory {
	public static void main (String[] args) {
		boolean done = false;
		String input = "";
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> items = new ArrayList <String> ();
		ArrayList<Integer> amount = new ArrayList <Integer> ();
		ArrayList<Double> price = new ArrayList <Double> ();
		
		System.out.println("GROCERY STORY INVENTORY");
		
		while(!done) {
			System.out.println("1) ADD ITEMS\n2) Change Price\n3) Change Quantites\n4) Check Item Status\n5) Check Total Inventory\n6) Help\n8) Quit");
			input = reader.next();
			if(input.equals("1")) {
				addItems(items, reader, price, amount);
				System.out.println(items + " Price: $" + price + " Amount: " + amount );
			}
		}
	}
	
	
	static void addItems(ArrayList items, Scanner reader, ArrayList price, ArrayList amount) {
		System.out.println("Enter the item you would like to add:");
		String input = reader.next();
		items.add(input);
		System.out.println("Enter the price:");
		Double inputPrice = reader.nextDouble();
		price.add(inputPrice);
		System.out.println("Enter the amount:");
		int inputAmount = reader.nextInt();
		amount.add(inputAmount);		
	}
	
	static void addQuantity(ArrayList numOfItems) {
		
	}
	
	static void priceItems(ArrayList price) {
		
	}
	
	
}




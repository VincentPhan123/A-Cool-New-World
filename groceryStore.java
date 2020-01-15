import java.util.*;
public class groceryStory {
	public static void main (String[] args) {
		boolean done = false;
		String input = "";
		Scanner reader = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList <Object> ();
		System.out.println("GROCERY STORY INVENTORY");
		
		while(!done) {
			System.out.println("1) ADD ITEMS\n2) Change Price\n3) Change Quantites\n4) Check Item Status\n5) Check Total Inventory\n6) Help\n8) Quit");
			input = reader.next();
			if(input.equals("1")) {
				addItems(al , reader);
				System.out.println(al);
			}if(input.contentEquals("2")){
				priceItems(al, reader);
				System.out.println(al);
			}
		}
	}
	
	
	static void addItems(ArrayList al, Scanner reader) {
		System.out.println("Enter the item you would like to add:");
		String input = reader.next();
		al.add(input);
		System.out.println("Enter the price:");
		Double inputPrice = reader.nextDouble();
		al.add(inputPrice);
		System.out.println("Enter the amount:");
		int inputAmount = reader.nextInt();
		al.add(inputAmount);		
	}
	
	static void addQuantity(ArrayList al) {
		
	}
	
	static void priceItems(ArrayList al, Scanner reader) {
		System.out.println("What price do you want to change for an item?\n" + al);
		String input = reader.next();
		int index = al.indexOf(input + 1);
		System.out.println("Ok what will be " + input + "'s new price?");
		double newPrice = reader.nextDouble();
		al.set(index , newPrice);
	}
	
	
}




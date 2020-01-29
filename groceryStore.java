
import java.util.*;
public class groceryStore {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList <Object> ();
		System.out.println("GROCERY STORE INVENTORY");
		menu(al, reader);
	}
	
	static void menu(ArrayList al, Scanner reader) {
		boolean done = false;
		String input = "";
		
		while(!done) {
			System.out.println("1) Add Items\n2) Change Price\n3) Change Quantites\n4) Check Item Status\n5) Check Total Inventory\n6) Item List\n7) Quit");
			input = reader.next();
			if(input.equals("1")) {
				addItems(al , reader);
			}else if(input.equals("2")){
				priceItems(al, reader);
			}else if(input.equals("3")){
				addQuantity(al, reader);
			}else if(input.equals("4")){
				checkItem(al, reader);
			}else if(input.equals("5")) {
				inventoryCheck(al,reader);
			}else if(input.equals("6")){
				printList(al);
			}else if(input.equals("7")) {
				done = true;
			}
		}
	}
	
	static void addItems(ArrayList al, Scanner reader) {
		System.out.println("Enter b to go to back the MENU\nEnter item:");
		String input = reader.next().toUpperCase();
		if(input.contentEquals("B")) {
			menu(al,reader);
		}
		al.add(input);
		System.out.println("Enter the price:");
		Double inputPrice = reader.nextDouble();
		al.add(inputPrice);
		System.out.println("Enter the amount:");
		double inputAmount = reader.nextDouble();
		al.add(inputAmount);		
	}
	
	static void addQuantity(ArrayList al, Scanner reader) {
		System.out.println("Enter b to go to back the MENU\nQuantity Change\nEnter item:\n" + al);
		String input = reader.next().toUpperCase();
		if(input.contentEquals("B")) {
			menu(al,reader);
		}
		if(!al.contains(input)) {
			System.out.println("Sorry that item is not in the system. Enter your item again.");
			addQuantity(al, reader);
		}
		int index = al.indexOf(input);
		index += 2;
		System.out.println("Ok what will be " + input + "'s new quantity?\n" + al);
		int newQuantity = reader.nextInt();
		al.set(index, newQuantity);
	}
	
	static void priceItems(ArrayList al, Scanner reader) {
		System.out.println("Enter b to go to back the MENU\nPrice Change\nEnter Item:\n" + al);
		String input = reader.next().toUpperCase();
		if(input.contentEquals("B")) {
			menu(al,reader);
		}
		if(!al.contains(input)) {
			System.out.println("Sorry that item is not in the system. Enter your item again.");
			priceItems(al, reader);
		}
		int index = al.indexOf(input);
		index += 1;
		System.out.println("Ok what will be " + input + "'s new price?");
		double newPrice = reader.nextDouble();
		al.set(index , newPrice);
	}
	
	static void checkItem(ArrayList al, Scanner reader) {
		System.out.println("Enter b to go to back the MENU\nStatus Check\nEnter Item: ");
		String input = reader.next().toUpperCase();
		double totalPrice = 0;
		if(input.contentEquals("B")) {
			System.out.println("Item List\n");
			menu(al,reader);
		}
		if(!al.contains(input)) {
			System.out.println("Sorry that item is not in the system. Enter your item again.");
			checkItem(al, reader);
		}
		int index1 = al.indexOf(input);
		index1 += 1;
		int index2 = al.indexOf(input);
		index2 += 2;
		double price = (double)al.get(index1);
		double inventory = (double)al.get(index2);
		totalPrice = price * inventory;
		System.out.println(input + " price: $" + al.get(index1) + " quantity: " + al.get(index2) + " Total Price: $" + totalPrice);
	}
	
	static void printList(ArrayList al) {
		System.out.println(al);
	}
	
	static void inventoryCheck(ArrayList al, Scanner reader) {
		System.out.println("Enter b to go to back the MENU\nInventory Check");
		
		double totalInventory = 0;
		double totalPrice = 0;
		double finalPrice = 0;
		
		if(al.size() == 3) {
			System.out.println("Total Inventory: " + al.get(2));
		}else if(al.size() >= 6) {
			for(int i = 2; i < al.size(); i += 3) {
				totalInventory += (double)al.get(i);
			}
			System.out.println("Total Inventory: " + totalInventory);
		}
		
	
		for(int i = 1; i < al.size(); i += 3) {
			totalPrice += (double)al.get(i);
			finalPrice = (totalPrice * totalInventory);
		}
		
		
		System.out.println("Total Price: $" + finalPrice);
		String input = reader.next().toLowerCase();
		if(input.contentEquals("b")) {
			menu(al,reader);
		}
	}
}

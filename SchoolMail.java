import java.util.Scanner;

public class SchoolMail {
	public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter you first, middle, and last name.");
		 String firstName = scanner.next().toLowerCase();
		 String middleName = scanner.next().toLowerCase();
		 String lastName = scanner.next().toLowerCase();
		 String upperFirstName = firstName.substring(0,1);
		 int lenLastName = lastName.length();
		 String email = "";
		 
		 
		 if(lenLastName >= 6) {
			 email = "Hello " + upperFirstName.toUpperCase() + firstName.substring(1) + " Welcome To Colgan! Your email is: " + lastName.substring(0,6) + firstName.substring(0,1) + middleName.substring(0,1) + "@colganhs.edu";
		 }
		 else {
			 email = "Hello " + upperFirstName.toUpperCase() + firstName.substring(1) + " Welcome To Colgan! Your email is: " + lastName + firstName.substring(0,1) + middleName.substring(0,1) + "@colganhs.edu";
		 }
		 System.out.println(email);
	}
}

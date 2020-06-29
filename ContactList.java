import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactList{

	public static void main(String[] args){

		//start up decision on what will run//
		String start;
		Scanner startUp = new Scanner(System.in);
		System.out.println("Enter 'new contact', 'find', or 'delete'.");
		start = startUp.nextLine();
		//System.out.print(start);// testing what start variable became

		if(start.equals("new contact")){

		//new contact variable//
		ArrayList<String> contact = new ArrayList<String>();

		//entering info of contact//
		Scanner newContactName = new Scanner(System.in);
		System.out.println("Enter name");
		contact.add(newContactName.nextLine());

		Scanner newContactPhoneNumber = new Scanner(System.in);
		System.out.println("Enter phone number");
		contact.add(newContactPhoneNumber.nextLine());

		Scanner newContactAddress = new Scanner(System.in);
		System.out.println("Enter address");
		contact.add(newContactAddress.nextLine());

		Scanner newContactAdditionalInfo = new Scanner(System.in);
		System.out.println("Enter any extra information");
		contact.add(newContactAdditionalInfo.nextLine());
		
		//converting contact arraylist into an array for the contactList arraylist//
		List<String> contactList = new ArrayList(Arrays.asList(contact));


		System.out.println(contactList);
		}	else if(start == "find") {

		}	else if(start == "delete") {

		}	else{
			System.out.println("Incorrect input");
		}
	}

}
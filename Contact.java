import java.util.Scanner;

public class Contact{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(){ //constructer for a new contact
		Scanner in = new Scanner(System.in);

		System.out.println("Enter first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter last name: ");
		this.lastName = in.nextLine();

		System.out.println("Enter phone number: ");
		this.phoneNumber = in.nextLine();

		System.out.println("Enter address(include shipping address, city, country, and zip number): ");
		this.address = in.nextLine();

		System.out.println("\n");

		System.out.println("Name: " + firstName + " " + lastName +
							"\nPhone number: " + phoneNumber +
							"\nAddress: " + address);

	}

	public static void main(String[] args){
		System.out.println("Enter number of new contacts to add.");
		Scanner num = new Scanner(System.in);
		int numOfContacts = num.nextInt();
		Contact[] contacts = new Contact[numOfContacts];

		for(int n = 0; n < numOfContacts; n++){
			contacts[n] = new Contact();
			System.out.println("\n");			
			System.out.println(contacts[n].toString());
		}
		System.out.println(contacts);
	}

}
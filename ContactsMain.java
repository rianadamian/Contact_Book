package a2;
import java.util.Hashtable;
import java.util.Scanner;

//Name: Rían Adamian
//Student ID: 260712101

public class ContactsMain {
	
	
	public static void main(String[] args) {
		
		//Create the I/O scanner to read user input, then a hash table to function as the phonebook.
		//The hash table takes as parameters 10 as its initial capacity, and a load factor of .75 so that it adjusts to
		//a growing contacts list.
		Scanner reader = new Scanner(System.in);
		Hashtable<String, ContactsContact> phonebook = new Hashtable<String, ContactsContact>(10, (float) 0.75);
		
		//Displays main menu, user responds with number corresponding to their desired choice:
		System.out.println("1. New Contact \n2. Find Contact \n3. List All \n4. Quit");
		
		int choice = reader.nextInt();
		
		//This is the loop the user will stay in until they select Quit in the main menu. 
		while (choice != 4) {
			
			
			//The user chooses New Contact:
			if (choice == 1) {
				
				//Display types of contacts to add from which the user can choose, again via the corresponding number.
				System.out.println("Choose type of contact: \n1. Acquaintance \n2.Business \n3. Friend");
				int choiceContact = reader.nextInt();
				
				//The name and phone number fields are required by all types of contacts, so I prompt
				//the user to enter those fields first, before the if-else chain prompting the user to enter fields pertaining
				//to businesses and friends.
				System.out.println("Please enter name: ");
				String name = reader.nextLine();
				
				System.out.println("Please enter phone number: ");
				String phoneNo = reader.nextLine();
				
				
				//The user chooses Acquaintance:
				if (choiceContact == 1) {
					
					ContactsAcquaintance newContact = new ContactsAcquaintance(name, phoneNo);
					phonebook.put(name, newContact);
				
				//The user chooses Business:
				} else if (choiceContact == 2) {
					
					System.out.println("Please enter address: ");
					String address = reader.nextLine();
					
					System.out.println("Please enter business name: ");
					String businessName = reader.nextLine();
					
					ContactsBusiness newContact = new ContactsBusiness(name, phoneNo, address, businessName);
					phonebook.put(name, newContact);
					
				//The user chooses Friend:
				} else if (choiceContact == 3) {
					
					System.out.println("Please enter address: ");
					String address = reader.nextLine();
					
					System.out.println("Please enter birthdate: ");
					String birthdate = reader.nextLine();
					
					ContactsFriend newContact = new ContactsFriend(name, phoneNo, address, birthdate);
					phonebook.put(name, newContact);
				}
				
				
			//The user chooses Find Contact:
			} else if (choice == 2) {
			
				System.out.println("Please enter name: ");
				String name = reader.nextLine();
				
				
				//If there is a match in the phonebook, the contact's info is displayed. If not, "Not found" is displayed
				//and the user will return to the main menu.
				if (phonebook.containsKey(name) == true) {
					System.out.println(phonebook.get(name).info());
				} else {
					System.out.println("Not found");
				}
				
				
			//The user chooses List All:
			} else if (choice == 3) {
				
				System.out.println("TYPE \t NAME \t PHONE \t ADDRESS \t BIRTHDATE");
				
				for (String name : phonebook.keySet()) {
					
					if (phonebook.get(name).getClass() == ContactsAcquaintance.class) {
						System.out.println("Acquaintance\t" + phonebook.get(name).getName() + "\t" + phonebook.get(name).getPhoneNumber());
						
					} else if (phonebook.get(name).getClass() == ContactsBusiness.class) {
						System.out.println("Business\t" + phonebook.get(name).getName() + "\t" + phonebook.get(name).getPhoneNumber() + "\t" + ((ContactsBusiness) phonebook.get(name)).getAddress());
						
					} else if (phonebook.get(name).getClass() == ContactsFriend.class) {
						System.out.println("Friend\t" + phonebook.get(name).getName() + "\t" + phonebook.get(name).getPhoneNumber() + "\t" + ((ContactsFriend) phonebook.get(name)).getAddress() + "\t" + ((ContactsFriend) phonebook.get(name)).getBirthdate());
					}
				}				
			}
			
			
			//Program returns to main menu
			System.out.println("1. New Contact \n2. Find Contact \n3. List All \n4. Quit");
			choice = reader.nextInt();
		}
		
		reader.close();
		
	}

}

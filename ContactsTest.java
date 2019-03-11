package a2;

//Name: Rían Adamian
//Student ID: 260712101

//Purpose: This program tests the constructors and methods found in ContactsContact.java, ContactsAcquaintance.java, ContactsBusiness.java,
//and ContactsFriend.

public class ContactsTest {
	
	public static void main(String[] args) {
		
		//Initialize a counter for program errors that will display at the end of testing.
		int errorCount = 0;
		
		
		//Testing ContactsAcquaintance:
		
		//ContactsAcquaintance constructor:
		ContactsAcquaintance c1 = new ContactsAcquaintance("Louis-Philippe", "1234567890");
		
		if (c1.getClass() != ContactsAcquaintance.class) {
			System.out.println("ContactsAcquaintance constructor did not instantiate a ContactsAcquaintance object.");
			errorCount++;
		}
		
		//Testing getter methods called from ContactsContact by ContactsAcquaintance object:
		if (c1.getName() != "Louis-Philippe") {
			System.out.println("ContactsAcquaintance.getName() did not return the correct name.");
			errorCount++;
		}
		
		if (c1.getPhoneNumber() != "1234567890") {
			System.out.println("ContactsAcquaintance.getPhoneNumber() did not return the correct phone number.");
			errorCount++;
		}
		
		//Testing ContactsAcquaintance.info():
		if (c1.info().equals("Louis-Philippe" + "\n" + "1234567890") == false) {
			System.out.println("ContactsAcquaintance.info() did not return the correct information.");
			errorCount++;
		}
		
		//Testing setter methods called from ContactsContact by ContactsAcquaintance object:
		c1.setName("Marc-Antoine");
		if (c1.getName() != "Marc-Antoine") {
			System.out.println("ContactsAcquaintance.setName() did not change the contact's name.");
			errorCount++;
		}
		
		c1.setPhoneNumber("51436967356");
		if (c1.getPhoneNumber() != "51436967356") {
			System.out.println("ContactsAcquaintance.setPhoneNumber() did not change the contact's phone number.");
			errorCount++;
		}
		
		
		
		//Testing ContactsBusiness:
		
		//ContactsBusiness constructor:
		ContactsBusiness c2 = new ContactsBusiness("Marie-Helène", "7495736473", "4758 Rue Henri Julien", "Café Marie");
		
		if (c2.getClass() != ContactsBusiness.class) {
			System.out.println("ContactsBusiness constructor did not instantiate a ContactsBusiness object.");
			errorCount++;
		}
		
		//Testing ContactsBusiness getter methods:
		if (c2.getName() != "Marie-Helène") {
			System.out.println("ContactsBusiness.getName() did not return the correct name.");
			errorCount++;
		}

		if (c2.getPhoneNumber() != "7495736473") {
			System.out.println("ContactsBusiness.getPhoneNumber() did not return the correct phone number.");
			errorCount++;
		}

		if (c2.getAddress() != "4758 Rue Henri Julien") {
			System.out.println("ContactsBusiness.getAddress() did not return the correct phone number.");
			errorCount++;
		}

		if (c2.getBusinessName() != "Café Marie") {
			System.out.println("ContactsBusiness.getBusinessName() did not return the correct business name.");
			errorCount++;
		}
		
		//Testing ContactsBusiness.info():
		if (c2.info().equals("Marie-Helène" + "\n" + "7495736473" + "\n" + "4758 Rue Henri Julien" + "\n" + "Café Marie") == false) {
			System.out.println("ContactsBusiness.info() did not return the correct information.");
			errorCount++;
		}
		
		//Testing ContactsBusiness setter methods:
		c2.setName("Julie");
		if (c2.getName() != "Julie") {
			System.out.println("ContactsBusiness.setName() did not change the contact's name.");
			errorCount++;
		}
				
		c2.setPhoneNumber("7586957474");
		if (c2.getPhoneNumber() != "7586957474") {
			System.out.println("ContactsBusiness.setPhoneNumber() did not change the contact's phone number.");
			errorCount++;
		}
		
		c2.setAddress("300 Rue Sherbrooke O");
		if (c2.getAddress() != "300 Rue Sherbrooke O") {
			System.out.println("ContactsBusiness.setAddress() did not change the contact's address.");
			errorCount++;
		}
				
		c2.setBusinessName("Chez Julie");
		if (c2.getBusinessName() != "Chez Julie") {
			System.out.println("ContactsBusiness.setBusinessName() did not change the contact's business name.");
			errorCount++;
		}
		
		
		
		//Testing ContactsFriend:
				
		//ContactsFriend constructor:
		ContactsFriend c3 = new ContactsFriend("Sophie", "5147386474", "202 Rue Masson", "January 1, 1990");
		
		if (c3.getClass() != ContactsFriend.class) {
			System.out.println("ContactsFriend constructor did not instantiate a ContactsFriend object.");
			errorCount++;
		}
		
		
		//Testing ContactsFriend getter methods:
		if (c3.getName() != "Sophie") {
			System.out.println("ContactsFriend.getName() did not return the correct name.");
			errorCount++;
		}
				
		if (c3.getPhoneNumber() != "5147386474") {
			System.out.println("ContactsFriend.getPhoneNumber() did not return the correct phone number.");
			errorCount++;
		}
				
		if (c3.getAddress() != "202 Rue Masson") {
			System.out.println("ContactsFriend.getAddress() did not return the correct phone number.");
			errorCount++;
		}
			
		if (c3.getBirthdate() != "January 1, 1990") {
			System.out.println("ContactsFriend.getBirthdate() did not return the correct birthdate.");
			errorCount++;
		}
						
		
		//Testing ContactsFriend.info():
		if (c3.info().equals("Sophie" + "\n" + "5147386474" + "\n" + "202 Rue Masson" + "\n" + "January 1, 1990") == false) {
			System.out.println("ContactsFriend.info() did not return the correct information.");
			errorCount++;
		}
		
		
		//Testing ContactsFriend setter methods:
		c3.setName("Anaïs");
		if (c3.getName() != "Anaïs") {
			System.out.println("ContactsFriend.setName() did not change the contact's name.");
			errorCount++;
		}
				
		c3.setPhoneNumber("5145326453");
		if (c3.getPhoneNumber() != "5145326453") {
			System.out.println("ContactsFriend.setPhoneNumber() did not change the contact's phone number.");
			errorCount++;
		}
				
		c3.setAddress("4300 Rue Saint Michel");
		if (c3.getAddress() != "4300 Rue Saint Michel") {
			System.out.println("ContactsFriend.setAddress() did not change the contact's address.");
			errorCount++;
		}
						
		c3.setBirthdate("January 2, 1991");
		if (c3.getBirthdate() != "January 2, 1991") {
			System.out.println("ContactsFriend.setBirthdate() did not change the contact's birthdate.");
			errorCount++;
		}
		
		
		System.out.println("Total error count: " + errorCount);		
	}
}

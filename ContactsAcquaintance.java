package a2;

//Name: Rían Adamian
//Student ID: 260712101

//Purpose: This is a class for the Acquaintance contact that extends abstract class ContactsContact.

public class ContactsAcquaintance extends ContactsContact {
	
	public ContactsAcquaintance(String name, String phoneNo) {
		super(name, phoneNo);
	}
	
	public String info() {
		return this.getName() + "\n" + this.getPhoneNumber();
	}
}

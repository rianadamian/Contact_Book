package a2;

//Name: Rían Adamian
//Student ID: 260712101

//Purpose: This is the abstract class that provides the template for ContactsAcquaintance, 
//ContactsBusiness, and ContactsFriend. I choose to use an abstract class as an inheritance model because 
//I know a Contact will never be instantiated that isn't a Acquaintance, Business, or Friend.

abstract public class ContactsContact {
	
	//The attributes for this class are those shared by all types of contacts.
	private String name;
	private String phoneNo;

	
	//Constructor
	public ContactsContact(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	//Public setter functions that can be called by all types of contacts.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	//...And the respective getter functions.
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNo;
	}
	
	
	//Abstract method that will return a string of all the contact's fields appended.
	abstract public String info();
	
}

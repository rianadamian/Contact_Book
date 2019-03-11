package a2;

//Name: Rían Adamian
//Student ID: 260712101

//Purpose: This is a class for the Friend contact that extends abstract class ContactsContact.

public class ContactsFriend extends ContactsContact {
	
	//Attributes belonging only to Friend
	private String address;
	private String birthdate;
	
	
	//Constructor
	public ContactsFriend(String name, String phoneNo, String address, String birthdate) {
		super(name, phoneNo);
		this.address = address;
		this.birthdate = birthdate;
	}
	
	
	//Public setter functions for Friend-specific fields.
	public void setAddress(String address) {
		this.address = address;
	}
		
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
		
		
	//...And the respective getter functions.
	public String getAddress() {
		return this.address;
	}
		
	public String getBirthdate() {
		return this.birthdate;
	}
		
	
	//Implements abstract method info().
	public String info() {
		return this.getName() + "\n" + this.getPhoneNumber() + "\n" + this.getAddress() + "\n" + this.getBirthdate();
	}
	
}
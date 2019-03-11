package a2;

//Name: Rían Adamian
//Student ID: 260712101

//Purpose: This is a class for the Business contact that extends abstract class ContactsContact.

public class ContactsBusiness extends ContactsContact {
	
	//Attributes belonging only to Business
	private String address;
	private String businessName;
	
	
	//Constructor
	public ContactsBusiness(String name, String phoneNo, String address, String businessName) {
		super(name, phoneNo);
		this.address = address;
		this.businessName = businessName;
	}
	
	
	//Public setter functions for Business-specific fields.
	public void setAddress(String address) {
		this.address = address;
	}
			
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	
	//...And the respective getter functions.
	public String getAddress() {
		return this.address;
	}
			
	public String getBusinessName() {
		return this.businessName;
	}
			
		
	//Implements abstract method info().
	public String info() {
		return this.getName() + "\n" + this.getPhoneNumber() + "\n" + this.getAddress() + "\n" + this.getBusinessName();
	}
		
	
}
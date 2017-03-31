package arrayListExcercise;

public class Contact {
	
	private String contactName;
	private String contactPhoneNumber;
	
	public Contact(String contactName, String contactPhoneNumber) {
		this.contactName = contactName;
		this.contactPhoneNumber = contactPhoneNumber;
	}
	
	public String getContactName() {
		return contactName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	
	public static Contact addNewContact(String contactName, String contactPhoneNumber) {
		return new Contact(contactName, contactPhoneNumber);
	}
}

package arrayListExcercise;

import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> contactsList;
	
	public MobilePhone() {
		this.contactsList = new ArrayList<Contact>();
	}

	public boolean addContact(Contact contact) {
		if (searchContactIndexFromTheList(contact) != -1) {
			System.out.println("Cannot add this contact because it is already exist in the system.");
			return false;
		} else {
			this.contactsList.add(contact);
			System.out.println("New contact is added into the list.");
			return true;
		}
	}
	
	public void showContactList() {
		System.out.println("\n******** Contact List ********");
		getContactsList();
		System.out.println("******** End of Contact List ********\n");
	}
	
	public void getContactsList() {
		if (contactsList.size() > 0) {
			System.out.println("=====================================");
			for (int i = 0; i < contactsList.size(); i++) {
				System.out.println("Contact No. " + (i+1));
				System.out.println("Name: " + contactsList.get(i).getContactName());
				System.out.println("Phone Number: " + contactsList.get(i).getContactPhoneNumber());
				System.out.println("=====================================");
			}
		} else {
			System.out.println("There is no contact at the moment.");
		}
	}
	
	public void getContactNumberFromName(String contactName) {
		System.out.println(contactName + "'s phone number is: " + contactsList.get(searchContactbyName(contactName)).getContactPhoneNumber());
	}

	public int searchContactIndexFromTheList(Contact contact) {
		return contactsList.indexOf(contact);
	}
	
	public int searchContactbyName(String contactName) {
		for (Contact contact : contactsList) {
			if (contact.getContactName().equals(contactName)) {
				return contactsList.indexOf(contact); 
			}
		}
		return -1;
	}
	
	public Contact getContactObject(String contactName) {
		for (Contact contact : contactsList) {
			if (contact.getContactName().equals(contactName)) {
				return contact; 
			}
		}
		return null;
	}
	
	public void updateExistingContact(Contact oldContact, Contact newContact) {
		int contactIndex = searchContactIndexFromTheList(oldContact);
		if (contactIndex == -1) {
			System.out.println(oldContact.getContactName() + " was not found.");
		} else {
			contactsList.set(contactIndex, newContact);
			System.out.println(oldContact.getContactName() + " was updated by " + newContact.getContactName() + ".");
		}
	}
	
	public void removeContact(Contact targetContact) {
		int contactIndex = searchContactIndexFromTheList(targetContact);
		if (contactIndex == -1) {
			System.out.println(targetContact.getContactName() + " was not found.");
		} else {
			contactsList.remove(targetContact);
			System.out.println(targetContact.getContactName() + " has been removed.");
		}
	}
}

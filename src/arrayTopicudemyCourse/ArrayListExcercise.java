package arrayTopicudemyCourse;

import java.util.Scanner;

public class ArrayListExcercise {
	public static Scanner scanner = new Scanner(System.in);
	public static MobilePhone mobilePhone = new MobilePhone();
	public static void main (String[] args) {
		int selectedOption;
		do {
			showOptions();
			System.out.println("Please select your option: ");
			selectedOption = scanner.nextInt();
			scanner.nextLine();
			System.out.println("selected option is " + selectedOption);
			switch (selectedOption) {
			case 1:
				mobilePhone.showContactList();
				break;
			case 2:
				createContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchContact();
				break;

			default:
				break;
			}
		} while (selectedOption != 9);
	}

	private static void showOptions() {
		System.out.println("Options: (Type the number to trigger the function)");
		System.out.println("Press 1: Print list of contacts");
		System.out.println("Press 2: Add new contact");
		System.out.println("Press 3: Update existing contact");
		System.out.println("Press 4: Remove contact");
		System.out.println("Press 5: Search contact");
		System.out.println("Press 9: Exit the program");
	}
	
	private static void createContact() {
		System.out.println("You are now in adding new contact fucntion.");
		System.out.println("Please type name: ");
		String inputName = scanner.nextLine();
		System.out.println("Please type phone number: ");
		String inputPhoneNumber = scanner.nextLine();
		boolean isNewContactCreated = mobilePhone.addContact(Contact.addNewContact(inputName, inputPhoneNumber));
		if (isNewContactCreated) {
			System.out.println("Added name: " + inputName);
			System.out.println("Added phone number: " + inputPhoneNumber);
		} else {
			System.out.println(inputName + " is already exist.");
		}
	}
	
	private static void updateContact() {
		System.out.println("Updating contact menu is selected.");
		System.out.println("Enter existing contact name: ");
		String existingContact = scanner.nextLine();
		if (mobilePhone.searchContactbyName(existingContact) != -1) {
			System.out.println("This name is found in the list.");
			System.out.println("Enter new contact name to replace: ");
			String newContactName = scanner.nextLine();
			System.out.println("Enter new contact phone number to replace: ");
			String newContactPhoneNumber = scanner.nextLine();
			mobilePhone.updateExistingContact(mobilePhone.getContactObject(existingContact), Contact.addNewContact(newContactName, newContactPhoneNumber));
		} else {
			System.out.println("Input contact is not found from the list.");
		}
	}
	
	private static void removeContact() {
		System.out.println("Removing contact menu is selected.");
		System.out.println("Enter contact name to remove: ");
		String inputContact = scanner.nextLine();
		if (mobilePhone.searchContactbyName(inputContact) != -1) {
			mobilePhone.removeContact(mobilePhone.getContactObject(inputContact));
		} else {
			System.out.println("Input contact is not found from the list.");
		}
	}
	
	private static void searchContact() {
		System.out.println("Removing contact menu is selected.");
		System.out.println("Enter contact name to remove: ");
		String inputContact = scanner.nextLine();
		if (mobilePhone.searchContactbyName(inputContact) != -1) {
			mobilePhone.getContactNumberFromName(inputContact);
		} else {
			System.out.println("Input contact is not found from the list.");
		}
	}
}

package autoBoxingUnboxingExercise;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("Sand Bank");
		
		String branchName1 = "Asoke";
		String branchName2 = "Chidlom";
		String branchName3 = "Theparak";
		String customerName1 = "San McDaniel";
		String customerName2 = "SilverComet";
		String customerName3 = "Selenium";
		String customerName4 = "Java";
		String customerName5 = "QA";
		
		System.out.println("Command 1 *************************");
		bank.addNewBranch(branchName1);
		System.out.println();
		System.out.println("Command 2 *************************");
		bank.addCustomerToBranch(customerName1, branchName1, 123.4567);
		System.out.println();
		System.out.println("Command 3 *************************");
		bank.addCustomerToBranch(customerName1, branchName2, 250000);
		System.out.println();
		System.out.println("Command 4 *************************");
		bank.addCustomerToBranch("sand", branchName2, 250000);
		System.out.println();
		System.out.println("Command 5 *************************");
		bank.addCustomerTransaction(customerName1, "wrong1", 33333);
		System.out.println();
		System.out.println("Command 6 *************************");
		bank.addCustomerTransaction("no one", branchName1, 444.556);
		System.out.println();
		System.out.println("Command 7 *************************");
		bank.addCustomerTransaction("John doe", "Invisible", 666.789);
		System.out.println();
		System.out.println("Command 8 *************************");
		bank.addNewBranch(branchName2);
		bank.addNewBranch(branchName3);
		System.out.println();
		bank.addCustomerToBranch(customerName1, branchName1, 11);
		bank.addCustomerToBranch(customerName1, branchName2, 12);
		bank.addCustomerToBranch(customerName1, branchName3, 13);
		bank.addCustomerToBranch(customerName2, branchName2, 22);
		bank.addCustomerToBranch(customerName2, branchName3, 23);
		bank.addCustomerToBranch(customerName3, branchName3, 33);
		bank.addCustomerToBranch(customerName3, branchName1, 31);
		bank.addCustomerToBranch(customerName4, branchName1, 41);
		bank.addCustomerToBranch(customerName4, branchName3, 43);
		bank.addCustomerToBranch(customerName5, branchName2, 52);
		System.out.println();
		//System.out.println(bank.findBranch(branchName1));
		bank.addCustomerTransaction(customerName1, branchName1, 1111);
		bank.addCustomerTransaction(customerName1, branchName2, 1122);
		bank.addCustomerTransaction(customerName1, branchName3, 1133);
		bank.addCustomerTransaction(customerName2, branchName2, 2222);
		bank.addCustomerTransaction(customerName2, branchName3, 2233);
		bank.addCustomerTransaction(customerName3, branchName3, 3333);
		bank.addCustomerTransaction(customerName3, branchName1, 3311);
		bank.addCustomerTransaction(customerName4, branchName1, 4411);
		bank.addCustomerTransaction(customerName4, branchName3, 4433);
		bank.addCustomerTransaction(customerName5, branchName2, 5522);
		
		
		System.out.println("Command 9 *************************");
		bank.showCustomerListofTargetBranch(branchName1, true);
		System.out.println();
		System.out.println("Command 10 *************************");
		bank.showCustomerListofTargetBranch(branchName1, false);
		System.out.println();
		System.out.println("Command 10 *************************");
		bank.showCustomerListofTargetBranch(branchName2, true);
		System.out.println();
		System.out.println("Command 11 *************************");
		bank.showCustomerListofTargetBranch(branchName2, false);
		System.out.println();
		System.out.println("Command 12 *************************");
		bank.showCustomerListofTargetBranch(branchName3, true);
		System.out.println();
		System.out.println("Command 13 *************************");
		bank.showCustomerListofTargetBranch(branchName3, false);
		System.out.println();
	}
}

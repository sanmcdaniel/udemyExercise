package autoBoxingUnboxingExercise;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branches;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.branches = new ArrayList<Branch>();
	}

	public Branch getBranch(int index) {
		return this.branches.get(index);
	}
	
	public void addNewBranch(String branchName) {
		this.branches.add(new Branch(branchName));
		System.out.println(branchName + " branch has been created.");
		System.out.println();
	}
	
	public void addCustomerToBranch(String customerName, String branchName, double initialAmount) {
		Branch targetBranch = findBranch(branchName);
		if (targetBranch != null) {
			if (targetBranch.findCustomer(customerName) == null) {
				targetBranch.addNewCustomer(customerName, initialAmount);
				System.out.println(customerName + " has been created as new account in " + branchName + " branch with the initial amount of " + initialAmount + ".");
				System.out.println();
			} else {
				System.out.println("Cannot add " + customerName + " into " + branchName + " because this customer is exist in our record.");
				System.out.println();
			}
		} else {
			System.out.println(branchName + " is not found, please make sure that you typed correct branch name.");
			System.out.println();
		}
	}
	
	public void addCustomerTransaction(String customerName, String branchName, double transactionAmount) {
		Branch targetBranch = findBranch(branchName);
		if (targetBranch != null) {
			Customers targetCustomer = targetBranch.findCustomer(customerName);
			if (targetCustomer != null) {
				targetCustomer.addTransaction(transactionAmount);
				System.out.println(transactionAmount + " is added to " + customerName + "'s account.");
			} else {
				System.out.println(customerName + " is not found, please make sure that you typed correct customer name.");
			}
		} else {
			System.out.println(branchName + " is not found, please make sure that you typed correct branch name.");
		}
	}
	
	public void showCustomerListofTargetBranch(String branchName, Boolean showTransction) {
		Branch targetBranch = findBranch(branchName);
		if (targetBranch != null) {
			if (showTransction == true) {
				for (int i = 0; i < targetBranch.getCustomers().size(); i++) {
					System.out.println("=====================================================");
					System.out.println("Customer Name: " + targetBranch.getCustomers().get(i).getCustomerName());
					System.out.print("Transaction List: ");
					System.out.println(targetBranch.getCustomers().get(i).getTransactions());
					System.out.println("=====================================================");
				}
			} else {
				System.out.println("=====================================================");
				for (int i = 0; i < targetBranch.getCustomers().size(); i++) {
					System.out.print("Customer Name: ");
					System.out.println(targetBranch.getCustomers().get(i).getCustomerName());
				}
				System.out.println("=====================================================");
			}
		} else {
			System.out.println(branchName + " is not found, please make sure that you typed correct branch name.");
		}
	}
	
	public Branch findBranch(String branchName) {
		for (int i=0; i < branches.size(); i++) {
			if (branchName.equals(branches.get(i).getBranchName())) {
				return branches.get(i);
			} else {
				//return branches.get(i);
				//System.out.println(branchName + " is not found, please make sure that you typed correct branch name.");
			}
		}
		return null;
	}
}

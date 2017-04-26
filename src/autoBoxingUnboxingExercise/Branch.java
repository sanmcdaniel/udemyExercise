package autoBoxingUnboxingExercise;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customers> customers; 
	
	public Branch(String branchName) {
		this.branchName = branchName;
		this.customers = new ArrayList<Customers>();
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public ArrayList<Customers> getCustomers() {
		return customers;
	}

//	public boolean addNewCustomer(String customerName, double initialAmount) {
//		if (findCustomer(customerName) != null) {
//			this.customers.add(new Customers(customerName, initialAmount));
//			System.out.println("Adding new customer: " + customerName);
//			return true;
//		} else {
//			System.out.println(customerName + " is NOT found.");
//			return false;
//		}
//	}
	
	public boolean addNewCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customers(customerName, initialAmount));
			System.out.println("Adding new customer: " + customerName);
			return true;
		} else {
			System.out.println(customerName + " is already existing.");
			return false;
		}
	}
	
	public boolean addTransaction(String customerName, double transactionAmount) {
		Customers customerIndex = findCustomer(customerName); 
		if (customerIndex != null) {
			System.out.println("Adding new transaction: " + transactionAmount);
			customerIndex.addTransaction(transactionAmount);
			return true;
		} else {
			System.out.println(customers + " is NOT found.");
			return false;
		}
	}
	
	public Customers findCustomer(String customerName) {
		int index = 0;
		for (Customers expectedCustomer : customers) {
			if (expectedCustomer.getCustomerName().equals(customerName)) {
				return this.customers.get(index);
			} else {
				index++;
				return null;
			}
		}
		return null;
	}
}

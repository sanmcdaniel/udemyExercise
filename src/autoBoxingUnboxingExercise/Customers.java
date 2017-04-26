package autoBoxingUnboxingExercise;

import java.util.ArrayList;

public class Customers {
	private ArrayList<Double> transactions;
	private String customerName;
	
	public Customers(String customerName, double initialAmount) {
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
		this.customerName = customerName;
	}

	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}
	
	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public String getCustomerName() {
		return customerName;
	}
	
}

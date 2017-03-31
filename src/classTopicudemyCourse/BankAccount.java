package classTopicudemyCourse;

import java.text.Format;

public class BankAccount {
	public String accountNumber;
	public double balance;
	public String customerName;
	public String email;
	public String phoneNumber;
	
	public BankAccount() {
		System.out.println("BackAccount is called");
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void depositFunds(double depositAmount) {
		setBalance(this.balance + depositAmount);
		System.out.println("You have deposited " + depositAmount + " to your bank account.");
		System.out.println("Your new balance is " + getBalance());
		System.out.println();
	}
	
	public void withdrawFunds(double withdrawAmount) {
		if (getBalance() - withdrawAmount >= 0) {
			setBalance(this.balance - withdrawAmount);
			System.out.println("You have deposited " + withdrawAmount + " to your bank account.");
			System.out.println("Your remaining balance is " + getBalance());
		} else {
			System.out.println("Insufficient funds");
		}
		
	}
	
}

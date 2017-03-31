package classTopicudemyCourse;

public class VipCustomer {
	String name;
	double creditLimit;
	String emailAddress;

	public VipCustomer(String name, double creditLmit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLmit;
		this.emailAddress = emailAddress;
	}

	public VipCustomer(String name, double creditLmit) {
		this.name = name;
		this.creditLimit = creditLmit;
		this.emailAddress = "qa@webon.net";
	}

	public VipCustomer() {
		this.name = "Sand";
		this.creditLimit = 999_999.99;
		this.emailAddress = "sand@webon.net";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}

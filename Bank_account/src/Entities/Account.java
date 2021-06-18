package Entities;

public class Account {
	private int number;
	private String name;
	private double balance;

	public Account(int number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Account(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ----------------------------------
	public int getNumber() {
		return number;
	}

	public void depositValue(double value) {
		this.balance+=value;
	}
	public void withdraw(double value) {
		this.balance = this.balance - value -5.00;
	}
	
	
	
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}

}

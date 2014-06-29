package example.domain

class Account {
	
	private double balance = 0

	public Account(double balance) {
		this.balance = balance
	}
	
	public double getBalance() {
		return balance
	}

	public void increaseBalance(double amount) {
		balance += amount
	}
	
	public void decreaseBalance(double amount) {
		balance -= amount
	}
}

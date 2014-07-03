package example.domain

trait Account {
	double balance = 0
	
	void increaseBalance(double amount) {
		balance += amount
	}
	
	void decreaseBalance(double amount) {
		balance -= amount
	}
}

class SavingsAccount implements Account {
	SavingsAccount(balance) { this.balance = balance }
	@Override String toString() { "Savings: ${balance}" }
}

class CheckingAccount implements Account {
	CheckingAccount(balance) { this.balance = balance }
	@Override String toString() { "Checking: ${balance}" }
}
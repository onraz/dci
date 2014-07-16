package example.domain

trait Account {
	double balance = 0
	
	void increaseBalance(double amount) {
		balance += amount
	}
	
	void decreaseBalance(double amount) {
		balance -= amount
	}
	
	void updateLog(msg) {
		println msg
	}
}

class SavingsAccount implements Account {
	SavingsAccount(balance) { 
		this.increaseBalance(balance) 
	}
	
	@Override String toString() { 
		"Savings: ${balance}" 
	}
}

class CheckingAccount implements Account {
	CheckingAccount(balance) { 
		this.increaseBalance(balance)  
	}
	
	@Override String toString() { 
		"Checking: ${balance}" 
	}
}
package example.domain;

import example.dci.Actor;

public class Account implements Actor {
	
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void increaseBalance(double amount) {
		balance += amount;
	}
	
	public void decreaseBalance(double amount) {
		balance -= amount;
	}
}

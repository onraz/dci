package example.domain.roles

import example.domain.Loggable

/**
 * Methodful role to implement the usecase of withdrawal
 * Money is transferred from a MoneySource to MoneyDestination
 */
trait TransferMoneySource implements MoneySource, Loggable {
	
	void withdraw(double amount, MoneyDestination dest) {
		if (getBalance() > amount) {
			decreaseBalance(amount)
			dest.deposit(amount)
			updateLog("Withdrawal of ${amount} performed")
		} else {
			throw new IllegalArgumentException("Insufficient Balance in Source")
		}
	}
	
}

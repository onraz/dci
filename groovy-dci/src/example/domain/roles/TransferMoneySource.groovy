package example.domain.roles

/**
 * Methodful role to implement the usecase of withdrawal
 * Money is transferred from a MoneySource to MoneyDestination
 */
trait TransferMoneySource implements MoneySource {
	
	void withdraw(double amount, MoneyDestination dest) {
		if (getBalance() > amount) {
			this.decreaseBalance(amount)
			dest.deposit(amount)
			this.updateLog "Withdrawal of ${amount} performed"
		} else {
			throw new IllegalArgumentException("Insufficient Balance in Source")
		}
	}

}

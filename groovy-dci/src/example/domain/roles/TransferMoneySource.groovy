package example.domain.roles

/**
 * Methodful role to implement how Money is transferred from a Source
 * 
 */
trait TransferMoneySource implements MoneySource {
	
	public void withdraw(double amount) {
		if (this.getBalance() > amount) {
			this.decreaseBalance(amount)
		} else {
			throw new IllegalArgumentException("Insufficient Balance in Source")
		}
	}
	
}

package example.domain.roles

/**
 * Methodful role to implement how Money is transferred from a Source
 *
 */
trait TransferMoneyDestination implements MoneyDestination {
	public void deposit(double amount) {
		this.increaseBalance(amount)
	}
}

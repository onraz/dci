package example.domain.roles

import example.domain.Loggable

/**
 * Methodful role to implement how Money is transferred from a Source
 *
 */
trait TransferMoneyDestination implements MoneyDestination {
	public void deposit(double amount) {
		increaseBalance(amount)
	}
}

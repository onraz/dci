package example.domain;

import example.dci.Actor;
import example.dci.Role;

/**
 * Methodful role to implement how Money is transferred from a Source
 * 
 * @author Raz
 *
 */
public class TransferMoneySource implements MoneySource {
	Account account;
	
	@Override
	public Role apply(Actor actor) {
		this.account = (Account) actor;
		return this;
	}

	@Override
	public void withdraw(double amount) {
		if (account.getBalance() > amount) {
			account.decreaseBalance(amount);
		} else {
			throw new IllegalArgumentException("Insufficient Balance in Source");
		}
	}
}

package example.domain.roles;

import example.dci.Actor;
import example.dci.Role;
import example.domain.Account;

/**
 * Methodful role to implement how Money is transferred from a Source
 * 
 * @author Raz
 *
 */
public class TransferMoneyDestination implements MoneyDestination {
	Account account;
	
	@Override
	public Role apply(Actor actor) {
		this.account = (Account) actor;
		return this;
	}

	@Override
	public void deposit(double amount) {
		account.decreaseBalance(amount);
	}
}

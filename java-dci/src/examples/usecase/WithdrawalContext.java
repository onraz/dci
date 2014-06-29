package examples.usecase;

import example.dci.Context;
import example.domain.Account;
import example.domain.MoneyDestination;
import example.domain.MoneySource;
import example.domain.TransferMoneyDestination;
import example.domain.TransferMoneySource;

/**
 * Transfer Money from Source to Destination
 */
public class WithdrawalContext implements Context {
	
	Account sourceAccount;
	Account destAccount;
	double amount;

	public WithdrawalContext(Account source, Account destination, double amount) {
		this.sourceAccount = source;
		this.destAccount = destination;
		this.amount = amount;
	}
	
	@Override
	public void execute() throws Exception {
		MoneySource moneySource = (MoneySource) sourceAccount.actAs(TransferMoneySource.class);
		MoneyDestination moneyDestination = (MoneyDestination) destAccount.actAs(TransferMoneyDestination.class);
		
		moneySource.withdraw(amount);
		moneyDestination.deposit(amount);
	}

}

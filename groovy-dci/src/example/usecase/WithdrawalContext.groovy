package example.usecase

import example.dci.Context
import example.domain.Account
import example.domain.roles.MoneyDestination
import example.domain.roles.MoneySource
import example.domain.roles.TransferMoneyDestination
import example.domain.roles.TransferMoneySource

/**
 * Transfer Money from Source to Destination
 * Context attaches roles to Objects to fulfill a usecase
 */
public class WithdrawalContext implements Context {
	
	Account sourceAccount
	Account destAccount
	double amount
	
	@Override
	public void execute() throws Exception {
		MoneySource moneySource = sourceAccount.with TransferMoneySource
		MoneyDestination moneyDestination = destAccount.with TransferMoneyDestination
		
		moneySource.withdraw(amount)
		moneyDestination.deposit(amount)
	}

}

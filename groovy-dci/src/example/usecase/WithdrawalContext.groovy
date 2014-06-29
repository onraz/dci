package example.usecase

import example.domain.Account
import example.domain.roles.MoneyDestination
import example.domain.roles.MoneySource
import example.domain.roles.TransferMoneyDestination
import example.domain.roles.TransferMoneySource

/**
 * Transfer Money from Source to Destination
 * Context attaches roles to Objects to fulfill a usecase
 */
public class WithdrawalContext {
	
	Account source
	Account dest
	double amount
	
	def execute() {
		MoneySource moneySource = source as TransferMoneySource
		MoneyDestination moneyDestination = dest as TransferMoneyDestination
		
		moneySource.withdraw(amount)
		moneyDestination.deposit(amount)
	}

}

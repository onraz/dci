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
class WithdrawalContext {
	Account source, dest
	double amount
	
	def execute() {
		// Apply the role of a MoneySource to a source Account
		MoneySource moneySource = source as TransferMoneySource
		// Apply the role of a MoneyDestination to a destination Account
		MoneyDestination moneyDestination = dest as TransferMoneyDestination
		// Perform the usecase
		moneySource.withdraw(amount, moneyDestination)
	}
}

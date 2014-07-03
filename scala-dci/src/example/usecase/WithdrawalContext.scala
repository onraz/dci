package example.usecase;

import example.domain.Account
import example.domain.roles.TransferMoneySource
import example.domain.roles.TransferMoneyRecipient

/**
 * Transfer Money from Source to Destination
 * Context attaches roles to Objects to fulfill a usecase
 */
class WithdrawalContext(val source: Account, val dest:Account, val amount: Double)  {
	
	def execute() {
		//val moneySource = source.withRole TransferMoneySource.class
		//val moneyDestination = dest.withRole TransferMoneyRecipient.class
		//moneySource.transfer(amount, moneyDestination)
	}

}

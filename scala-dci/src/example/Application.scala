package example;

import example.domain.Account
import example.usecase.WithdrawalContext
import example.domain.SavingsAccount
import example.domain.CheckingAccount

object Application extends App {

		val savingAccount = new SavingsAccount(50.0)
		val checkingAccount = new CheckingAccount(200.0)
		
		println(s"Before Transaction: Savings $savingAccount, Checkings $checkingAccount\n")
		
//		val context = new WithdrawalContext(checkingAccount, savingAccount, 100);
//		context.execute();
		
		println(s"After Transaction: Savings $savingAccount, Checkings $checkingAccount\n")

}

package example

import example.domain.*
import example.usecase.WithdrawalContext

class Application {

	static main(args) {
		Account savings = new SavingsAccount(50.0)
		Account checkings = new CheckingAccount(200.0)
		
		println "Before Transaction: ${savings}, ${checkings}"
		
		new WithdrawalContext([source :checkings, dest: savings, amount:100]).execute()
		
		println "After Transaction: ${savings}, ${checkings}"
	}

}

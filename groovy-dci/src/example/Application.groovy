package example

import example.domain.Account
import example.usecase.WithdrawalContext

class Application {

	static main(args) {
		Account savings = new Account(50)
		Account checkings = new Account(200)
		
		println "Before Transaction: Savings ${savings.balance}, Checkings ${checkings.balance}"
		
		new WithdrawalContext([source :checkings, dest: savings, amount:100]).execute()
		
		println "After Transaction: Savings ${savings.balance}, Checkings ${checkings.balance}"
	}

}

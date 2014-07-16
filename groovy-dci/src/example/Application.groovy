package example

import example.domain.CheckingAccount
import example.domain.SavingsAccount
import example.usecase.WithdrawalContext

class Application {

	static main(args) {
def savings = new SavingsAccount(50.0)
def checkings = new CheckingAccount(200.0)

println "Before Tranfer: ${savings}, ${checkings}"

new WithdrawalContext([source :checkings, dest: savings, amount:100]).execute()

println "After Tranfer: ${savings}, ${checkings}"
	}

}

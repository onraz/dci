package example.domain

class SavingsAccount(var balance:Double) extends Account {
    override def toString = s"Savings Balance: ${availableBalance}"
}
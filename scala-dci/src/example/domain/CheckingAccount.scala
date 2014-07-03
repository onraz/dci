package example.domain

class CheckingAccount(var balance:Double) extends Account {
  override def toString = s"Checking Balance: ${availableBalance}"
}
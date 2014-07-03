package example.domain

trait Account {
  
  private var balance: Double = 0
  
  def availableBalance: Double = balance 
  
  def decreaseBalance(amount: Double) {
      if (amount < 0)
        throw new IllegalArgumentException
      balance -= amount
  }
  
  def increaseBalance(amount: Long) { 
    balance += amount
  }
  
}
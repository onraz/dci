package example.domain.roles

import example.domain.Account

/**
 * This is the methodful role for the source account for the money transfer
 */
trait TransferMoneySource extends MoneySource { 
  this: Account =>
  def transfer(amount: Long, recipient: MoneyRecipient) {
    if (availableBalance < amount) { 
      throw new IllegalArgumentException
    } else {
      decreaseBalance(amount)
      recipient.increaseBalance(amount)
    }
  }
}

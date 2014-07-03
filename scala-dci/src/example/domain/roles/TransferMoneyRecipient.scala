package example.domain.roles

import example.domain.Account

trait TransferMoneyRecipient extends MoneyRecipient {
  this: Account =>
    def transferFrom(amount: Long, src: MoneySource) {
     increaseBalance(amount)
    }
}

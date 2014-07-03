package example.domain.roles;

/* 
 * MoneySink is a methodless role type that captures the 
 * form (interface) of the other part of the Transfer behavior
 */
trait MoneyRecipient {
  def increaseBalance(amount: Long)
}
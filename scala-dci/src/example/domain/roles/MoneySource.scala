package example.domain.roles

/* 
 * MoneySource is a methodless role type that captures 
 * the form (interface) of part of the Transfer behavior
*/
trait MoneySource {
  def transferTo(amount: Long, recipient: MoneyRecipient)
}
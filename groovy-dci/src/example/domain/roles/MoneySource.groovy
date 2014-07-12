package example.domain.roles

/**
 * Method-less Role to represent a Source of Money
 * 
 */
interface MoneySource {
	void withdraw(double amount, MoneyDestination destination)
}
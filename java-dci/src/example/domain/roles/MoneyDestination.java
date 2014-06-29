package example.domain.roles;

import example.dci.Role;

/**
 * Method-less Role to represent a Destination for Money
 * 
 * @author Raz
 *
 */
public interface MoneyDestination extends Role {
	void deposit(double amount);
}
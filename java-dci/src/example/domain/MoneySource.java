package example.domain;

import example.dci.Role;

/**
 * Method-less Role to represent a Source of Money
 * 
 * @author Raz
 *
 */
public interface MoneySource extends Role {
	void withdraw(double amount);
}
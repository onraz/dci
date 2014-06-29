package example;

import example.domain.Account;
import example.usecase.WithdrawalContext;

public class Application {

	public static void main(String[] args) throws Exception {
		Account savingAccount = new Account(50);
		Account checkingAccount = new Account(200);
		
		System.out.printf("Before Transaction: Savings %s, Checkings %s\n", savingAccount.getBalance(),
				checkingAccount.getBalance());
		
		WithdrawalContext context = new WithdrawalContext(checkingAccount, savingAccount, 100);
		context.execute();
		
		System.out.printf("After Transaction: Savings %s, Checkings %s\n", savingAccount.getBalance(),
				checkingAccount.getBalance());
	}

}

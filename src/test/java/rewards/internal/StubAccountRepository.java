package rewards.internal;

import java.util.HashMap;
import java.util.Map;

import rewards.internal.account.Account;
import rewards.internal.account.AccountRepository;

public class StubAccountRepository implements AccountRepository {

	private Map<String, Account> accountsByCreditCard = new HashMap<String, Account>();

	public StubAccountRepository() {
		Account account = new Account();
		accountsByCreditCard.put("1234123412341234", account);
	}

	public Account findByCreditCard(String creditCardNumber) {
		Account account = accountsByCreditCard.get(creditCardNumber);
		if (account == null) {
			throw new RuntimeException("no account has been found for credit card number " + creditCardNumber);
		}
		return account;
	}

	public void updateBeneficiaries(Account account) {
	}
}
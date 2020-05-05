package example.app.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import example.app.entity.Account;

public class AccountUserDetails extends User {

	private final Account account;

	public AccountUserDetails(Account account, Collection<GrantedAuthority> authorities) {
		super(account.getUserName(), account.getPassword(),
			   true, true, true, true, authorities);

		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
}

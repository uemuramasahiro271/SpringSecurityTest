package example.app.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.app.entity.Account;
import example.app.repository.AccountRepository;
import example.app.security.AccountUserDetails;

@Service
public class AccountUserDetailsService implements UserDetailsService{

	@Autowired
	private AccountRepository accountRepository;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Account account = accountRepository.findOne(username);
		if(account == null) {
			throw new UsernameNotFoundException("user not found");
		}

		return new AccountUserDetails(account, getAuthorities(account));
	}

	private Collection<GrantedAuthority> getAuthorities(Account account){
		return AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
	}
}

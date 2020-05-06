package example.app.security;

import org.apache.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEventListeners {

	private static final Logger logger = Logger.getLogger(AuthenticationEventListeners.class);

	@EventListener
	public void handleInteractiveAuthenticationSuccess(
			InteractiveAuthenticationSuccessEvent event) {

		logger.info("認証に成功しました。ユーザー名：" + event.getAuthentication().getName());
	}

	@EventListener
	public void handleBadCredentials(
			AuthenticationFailureBadCredentialsEvent event) {

		logger.info("認証に失敗しました。ユーザー名：" + event.getAuthentication().getName());
	}
}

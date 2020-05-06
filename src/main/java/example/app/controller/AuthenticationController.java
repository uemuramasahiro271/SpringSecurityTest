package example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

	@GetMapping(path="/login")
	public String viewLoginForm() {
		return "auth/loginForm";
	}

	@GetMapping("/logout")
	public String viewLogoutForm() {
		return "auth/logoutForm";
	}

}

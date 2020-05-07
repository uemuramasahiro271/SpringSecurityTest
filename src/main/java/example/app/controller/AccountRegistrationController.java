package example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import example.app.form.AccountRegistrationForm;
import example.app.service.AccountServiceImpl;

@Controller
public class AccountRegistrationController {

	@Autowired
	private AccountServiceImpl accountService;

	@GetMapping("accountRegister")
	public String initView(Model model) {

		model.addAttribute("accountRegistrationForm", new AccountRegistrationForm());

		return "auth/accountRegisterForm";
	}

	@PostMapping("register")
	public String registerUser(@ModelAttribute AccountRegistrationForm form) {

		accountService.createAccount(form.getUserName(), form.getPassword());

		return "auth/accountRegistrationCompleteForm";
	}

}

package example.app.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import example.app.form.AccountForm;
import example.app.security.AccountUserDetails;

@Controller
public class AppController {

	@RequestMapping("/")
	public String show(@AuthenticationPrincipal AccountUserDetails userDetails, Model model) {
		AccountForm form = new AccountForm();
		form.setUserName(userDetails.getUsername());
		model.addAttribute("accountForm", form);

		return "index";
	}

}

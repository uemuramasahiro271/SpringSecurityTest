package example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("accountRegister")
public class AccountRegisterController {

	@GetMapping
	public String initView(Model model) {


		return "auth/accountRegisterForm";
	}

}

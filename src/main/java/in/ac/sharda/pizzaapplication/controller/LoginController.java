package in.ac.sharda.pizzaapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.LoginData;

@RestController
public class LoginController {

	@GetMapping("/login")
	public LoginData login() {
		return new LoginData();
	}
	
	@PostMapping
	public boolean login(@RequestBody LoginData Id) {
		if(Id.getPassword()!=null && Id.getUserName()!=null) {
			if(Id.getPassword().equals("abc")&& Id.getUserName().equals("abc")) {
				return true;
				
			}
		}
		return false;
	}
}

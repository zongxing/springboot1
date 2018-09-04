package com.mashensoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class UserControler {
	@RequestMapping("/listUser")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@RequestMapping("/userjson")
	public User userjson(@RequestParam(required=false) String username) {
		System.out.println(username);
		
		User user = new User();
		user.setUsername("abc");
		user.setPassword("123");
		return user;
	}
}

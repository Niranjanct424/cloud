package com.java.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public String getSampleResponse(@RequestParam String username) {
		return "Hey "+ username +" welcome to cloud";
	}
}

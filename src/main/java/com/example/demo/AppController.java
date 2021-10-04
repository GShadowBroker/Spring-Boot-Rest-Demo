package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome to my awesome little app! Enjoy your stay!";
	}
}

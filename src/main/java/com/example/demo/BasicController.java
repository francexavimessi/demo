package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@GetMapping("welcome")
	public String welcome() {
		return "Hello world";
	}
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}
//	@GetMapping("/login.html")
//	public String login() {
//		return "login.html";
//	}
//	
//	@GetMapping("welcome/name/{name}")
//	public String welcome(@PathVariable String name) {
//		return "Hello world "+ name;
//	}
	
}

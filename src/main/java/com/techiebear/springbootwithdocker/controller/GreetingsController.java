package com.techiebear.springbootwithdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

	@GetMapping("/hello")
	public String getGreetings() {
		return "hello,from Techie Bear!!!";
	}
}

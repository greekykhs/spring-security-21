package com.greekykhs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("/sayuser")
	public String sayUser(){
		return "Hello User";
	}
	
	@GetMapping("/echo/{message}")
	public String echoMessage(@PathVariable String message){
		if(message==null)
			return "Message is blank";
		else
			return message;
	}
}

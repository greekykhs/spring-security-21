package com.greekykhs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {	
	@GetMapping("/sayhello")
	public String sayHello(){
		return "Hello";
	}
	
	@GetMapping("/echo/{name}")
	public String echoName(@PathVariable String name){
		if(name==null)
			return "Name is blank";
		else
			return "Hello" + name;
	}
}

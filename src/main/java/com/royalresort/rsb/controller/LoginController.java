package com.royalresort.rsb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController 
{
 
	@GetMapping("/authentication")
	public String check()
	{
		return "hi";
	}
	
}

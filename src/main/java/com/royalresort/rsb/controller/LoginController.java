package com.royalresort.rsb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.royalresort.rsb.model.Login;
import com.royalresort.rsb.service.LoginService;

@RestController
public class LoginController 
{
	@Autowired
	private LoginService loginService;
 
	@PostMapping("/authentication")
	public ResponseEntity<Login> loginAuthentication( @RequestBody Login login)
	{
		return loginService.loginAuthentication(login);
	}
	
}

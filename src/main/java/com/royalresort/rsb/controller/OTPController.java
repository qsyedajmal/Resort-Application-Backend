package com.royalresort.rsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.royalresort.rsb.service.OTPService;

@RestController
public class OTPController 
{
	@Autowired
	private OTPService otpService;
	
	@PostMapping("/generateotp/{toEmail}")
	public ResponseEntity<String> generateOTP(@PathVariable String toEmail)
	{
		return otpService.generateOTP(toEmail);
	}

}

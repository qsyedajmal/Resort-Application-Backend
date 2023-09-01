package com.royalresort.rsb.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class OTPService 
{
	@Autowired
	private JavaMailSender mailSender;
	
	
	@Value("${spring.mail.username}")
	private String fromMail;

	public ResponseEntity<String> generateOTP(String toEmail) 
	{ 
		
		try 
		{
			SimpleMailMessage mail = new SimpleMailMessage();
			
			String otp = generateRandomOTP();
			
			mail.setFrom(fromMail);
			mail.setTo(toEmail);
			mail.setSubject("OTO verification");
			mail.setText("Hello your OTP is " + otp);
			 
			mailSender.send(mail);
			
			return new ResponseEntity<>(otp,HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		

	}
	
	private String generateRandomOTP()
	{
		
		Random random = new Random();
		int randomNumber = random.nextInt(999999);
		
		String randomNumberString = Integer.toString(randomNumber);
		
        while (randomNumberString.length()<6) 
        {
			randomNumberString = "0"+randomNumberString;
		}
		
		return randomNumberString;		
	}

}

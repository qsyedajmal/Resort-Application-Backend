package com.royalresort.rsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.royalresort.rsb.DAO.LoginDAO;
import com.royalresort.rsb.model.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;


	public ResponseEntity<Login> loginAuthentication(Login login) 
	{
		Login dbLogin = loginDAO.findByEmail(login.getEmail());
		
		
		if (dbLogin!=null) 
		{
			
			if (login.getEmail().equals(dbLogin.getEmail())) 
			{
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			}
		}

		else {
			loginDAO.save(login);

		}

		return new ResponseEntity<>(HttpStatus.OK);
	}

}

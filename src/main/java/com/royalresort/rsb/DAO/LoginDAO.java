package com.royalresort.rsb.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.royalresort.rsb.model.Login;


public interface LoginDAO extends JpaRepository<Login, Integer>
{
	Login findByEmail(String email);

}

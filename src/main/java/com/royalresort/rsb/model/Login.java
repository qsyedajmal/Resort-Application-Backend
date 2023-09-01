package com.royalresort.rsb.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Login {
	
	
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //to automatic genettate primary key
	Integer id;
	
	public String email;
	public String password;

}

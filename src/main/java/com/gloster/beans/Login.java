package com.gloster.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Login {
	
	@Bean
	public boolean LoginValidation(){
		
		return false;
	}

}

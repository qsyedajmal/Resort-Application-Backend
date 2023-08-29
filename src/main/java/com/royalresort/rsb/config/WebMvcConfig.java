package com.royalresort.rsb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//Cross Origin Request configuration ( CORS )
//Allowing all requests only from http://localhost:3000/

@Configuration
public class WebMvcConfig implements WebMvcConfigurer
{
    @Override
	public void addCorsMappings(CorsRegistry registry) 
    {
    	registry.addMapping("/**")
    	        .allowedMethods("*")
    	        .allowedOrigins("http://localhost:3000");
	}

}

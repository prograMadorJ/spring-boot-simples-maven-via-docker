package com.skell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@SpringBootApplication
public class SkellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkellApplication.class, args);
	}
		
	
}

package com.module.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;





@SpringBootApplication
public class SpringProjectPApplication {

	@GetMapping("/message")
	public String messsage() {
		return "My Java app is successfully deployed!!";
	
	}
	public static void main(String[] args) {
	SpringApplication.run(SpringProjectPApplication.class, args);
   
	
		
	}

}

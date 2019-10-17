package com.example.dkdevdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DkDevDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DkDevDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String getMessage() {
		
		return "@@@@@Welcome to springboot git jenkins application";
	}
	
	@GetMapping("/hello")
	public String getMessage1() {
		
		return "Maggie to spring boot message2";
	}

}

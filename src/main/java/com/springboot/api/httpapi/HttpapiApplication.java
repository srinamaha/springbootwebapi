package com.springboot.api.httpapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HttpapiApplication {

	@GetMapping("/live")
	public String message(){
		return "Well done";
	}
	public static void main(String[] args) {
		SpringApplication.run(HttpapiApplication.class, args);
	}

}

package com.dive2sky.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestdemoApplication {

	@RequestMapping("/")
	String home() {
		return "Hello, World";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}
}

package com.men0123.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionApplication {
	@GetMapping("/wellcome")
	public String home() {
		return "Hello Github Actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}

}

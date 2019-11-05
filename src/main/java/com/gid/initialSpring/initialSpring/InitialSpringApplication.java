package com.gid.initialSpring.initialSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class InitialSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialSpringApplication.class, args);
	}

}

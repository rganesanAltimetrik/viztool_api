package com.altimetrik.altivisio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AltivisioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltivisioApplication.class, args);
	}

}

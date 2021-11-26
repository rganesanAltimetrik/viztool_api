package com.altimetrik.altivisio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
		//(scanBasePackages={"com.altimetrik.altivisio.service","com.altimetrik.altivisio.repository"})
@ComponentScan(basePackages = {"com.altimetrik.altivisio.service","com.altimetrik.altivisio.repository","com.altimetrik.altivisio.config","com.altimetrik.altivisio.controller"})

public class AltivisioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltivisioApplication.class, args);
	}

}

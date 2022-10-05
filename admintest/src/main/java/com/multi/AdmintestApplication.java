package com.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AdmintestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmintestApplication.class, args);
	}

}

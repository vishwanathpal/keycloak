package com.h24.service.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PatientReadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientReadServiceApplication.class, args);
	}

}

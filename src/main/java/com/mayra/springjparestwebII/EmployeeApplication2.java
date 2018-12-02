package com.mayra.springjparestwebII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 *
 * @author Mayra1600036
 */

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication2 {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication2.class, args);
	}
	
}

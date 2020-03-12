package com.example.progetto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ProgettologinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettologinApplication.class, args);
	}

}

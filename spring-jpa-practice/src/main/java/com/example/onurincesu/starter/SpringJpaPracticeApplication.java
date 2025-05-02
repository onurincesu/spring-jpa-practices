package com.example.onurincesu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages= {"com.example.onurincesu"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.onurincesu"})
@ComponentScan(basePackages = {"com.example.onurincesu"})
public class SpringJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPracticeApplication.class, args);
	}

}

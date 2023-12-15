package com.tech;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpastreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpastreamApplication.class, args);
	}

	@Bean
	public JPAStreamer jpaStreamer(EntityManagerFactory entityManagerFactory) {
		return JPAStreamer.of(entityManagerFactory);
	}
}

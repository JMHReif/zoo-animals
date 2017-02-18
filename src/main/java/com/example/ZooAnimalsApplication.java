package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZooAnimalsApplication {
	@Bean
	CommandLineRunner createBean(AnimalRepository animalRepository) {
		return args -> {
			animalRepository.save(new Animal("Camel", "Sahara"));
			animalRepository.save(new Animal("Dolphin","Trixie"));
			animalRepository.save(new Animal("Penguin", "Polar"));
			animalRepository.save(new Animal("Bobcat", "Link"));

			animalRepository.findAll().forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ZooAnimalsApplication.class, args);
	}
}

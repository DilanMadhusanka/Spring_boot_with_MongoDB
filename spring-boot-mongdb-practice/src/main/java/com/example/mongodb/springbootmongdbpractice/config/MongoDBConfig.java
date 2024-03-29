package com.example.mongodb.springbootmongdbpractice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mongodb.springbootmongdbpractice.document.Users;
import com.example.mongodb.springbootmongdbpractice.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				userRepository.save(new Users(1, "Perter", "Development", 3000L));
				userRepository.save(new Users(2, "Sam", "Operations", 2000L));
				
			}
			
		};
		
	}
}

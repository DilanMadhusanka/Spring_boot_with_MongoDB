package com.example.mongodb.springbootmongdbpractice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.springbootmongdbpractice.document.Users;
import com.example.mongodb.springbootmongdbpractice.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public List<Users> getAll() {
		return userRepository.findAll();
	}
}

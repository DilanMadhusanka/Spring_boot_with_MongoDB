package com.example.mongodb.springbootmongdbpractice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.springbootmongdbpractice.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{

}

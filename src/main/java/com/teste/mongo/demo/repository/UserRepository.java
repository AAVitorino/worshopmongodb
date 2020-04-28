package com.teste.mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.teste.mongo.demo.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

	
	

}

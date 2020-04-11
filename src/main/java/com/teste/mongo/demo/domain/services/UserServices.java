package com.teste.mongo.demo.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.mongo.demo.domain.User;
import com.teste.mongo.demo.repository.UserRepository;

@Service
public class UserServices {
	
	//injeçao de dependencia automatica
	@Autowired
	private UserRepository repo;
	
	public List<User> FindAll(){
		
		return repo.findAll();
		
	}

	
	
}

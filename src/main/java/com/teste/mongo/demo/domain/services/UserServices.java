package com.teste.mongo.demo.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.mongo.demo.domain.User;
import com.teste.mongo.demo.domain.services.exception.ObjectNotFoundException;
import com.teste.mongo.demo.dto.UserDTO;
import com.teste.mongo.demo.repository.UserRepository;

@Service
public class UserServices {
	
	//injeçao de dependencia automatica
	@Autowired
	private UserRepository repo;
	
	public List<User> FindAll(){
		
		return repo.findAll();
		
	}
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado!");
			
		}
		return user;
		
	}
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(),objDTO.getName(),objDTO.getEmail());
	}

	
	
}

package com.teste.mongo.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.mongo.demo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	//cria o request method no metodo finAll
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		User maria = new User("1", "maria silva", "maria@maria.com");
		User joao = new User("2", "Joao Silva", "joao@maria.com");
		List<User> list = new ArrayList<>();
		
		//adiciona todos os usuarios na lista
		list.addAll(Arrays.asList(maria,joao));
		
		return ResponseEntity.ok().body(list);
	}
	
	
	

}

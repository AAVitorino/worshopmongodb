package com.teste.mongo.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.mongo.demo.domain.User;
import com.teste.mongo.demo.domain.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserServices service;
	
	//cria o request method no metodo finAll
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.FindAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	

}

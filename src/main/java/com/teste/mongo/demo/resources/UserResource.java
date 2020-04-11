package com.teste.mongo.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.mongo.demo.domain.User;
import com.teste.mongo.demo.domain.services.UserServices;
import com.teste.mongo.demo.dto.UserDTO;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserServices service;
	
	//cria o request method no metodo finAll
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		
		List<User> list = service.FindAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listDTO);
	}
	
	
	

}

package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.UserDomain;
import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class TestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAll")
	public List<UserDomain> getAllUser() {
		return  userService.getUser();
	}
	
	@GetMapping("/get/{id}")
	public Optional<User> getUserById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/save/user")
	public Integer saveUser(@RequestBody UserDto req) {
		return userService.saveUser(req);
		
	}
}

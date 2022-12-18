package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.UserDomain;
import com.example.service.UserService;

@RestController
public class TestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public UserDomain getTest() {
		return  userService.getUser();
	}
}

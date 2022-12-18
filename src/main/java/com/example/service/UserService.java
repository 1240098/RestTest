package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.UserDomain;
import com.example.entity.User;
import com.example.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDomain getUser() {
		User user = userRepository.findAll().get(0);
		UserDomain userDomain = new UserDomain(user);
		return userDomain;
	}
}

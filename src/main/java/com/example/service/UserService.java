package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public List<UserDomain> getUser() {
		List<User> users = userRepository.findAll();
		
		List<UserDomain> userDomain = new ArrayList<>() ;
		
		for (User user : users) {
			userDomain.add(new UserDomain(user));
			}
		return userDomain;
	}
	
	public Optional<User> getUserById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
}

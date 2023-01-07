package com.example.domain;

import com.example.dto.UserDto;
import com.example.entity.User;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDomain {

	private Integer id;
	private String name;
	private String nameKana;
	private String email;
	private String tel;
	private Integer gender;

	public UserDomain(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEMail();
		this.tel = user.getTel();
		this.gender = user.getGender();
	}
	
	public static User convertEntity(UserDto req) {
		User user = new User();
		
		user.setId(req.getId());
		user.setName(req.getName());
		user.setNameKana(req.getNameKana());
		user.setTel(req.getTel());
		user.setGender(req.getGender());
		user.setEMail(req.getEmail());
		
		return user;
		
	}
	
}

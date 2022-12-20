package com.example.domain;

import com.example.entity.User;

import lombok.Data;

@Data

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
	
	public UserDomain() {}
}

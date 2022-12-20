package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("name_kana")
	private String nameKana;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("tel")
	private String tel;
	
	@JsonProperty("gender")
	private Integer gender;

}

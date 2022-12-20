package com.example.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user",schema = "public")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "name_kana")
	private String nameKana;
	
	@Column(name = "e_mail")
	private String eMail;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "gender")
	private Integer gender;



	
}

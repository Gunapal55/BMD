package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {

	@Id
//	@NotNull
//	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	@Column(name = "email")
	private String email;

//	@NotNull
//	@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{8, 20}$")
	@Column(name = "pwd")
	private String password;

//	@NotNull
//	@Pattern(regexp = "(0/91)?[7-9][0-9]{9}")
	@Column(name = "ph")
	private int phone;

	@Column(name = "role")
	private String role;

}

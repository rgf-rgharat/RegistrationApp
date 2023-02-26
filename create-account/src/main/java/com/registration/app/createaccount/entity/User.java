package com.registration.app.createaccount.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="USER_TBL")
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private char gender;
	private long number;
	private String email;
	private String password;
}

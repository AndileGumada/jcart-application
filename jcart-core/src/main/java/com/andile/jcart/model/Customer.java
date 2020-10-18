package com.andile.jcart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Table(name="customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="firstname", nullable=false)
	@NotEmpty
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@NotEmpty
	@Email
	@Column(name="email", nullable=false, unique=true)
	private String email;
	@NotEmpty
	@Column(name="password", nullable=false)
	private String password;
	private String phone;
}

package com.andile.jcart.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false)
	@NotEmpty
	private String name;
	@Column(nullable=false, unique=true)
	@NotEmpty
	@Email(message="{errors.invalid_email}")
	private String email;
	@Column(nullable=false)
	@NotEmpty
	@Size(min=4)
	private String password;
	private String passwordResetToken;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = {@JoinColumn(name= "USER_ID",referencedColumnName = "ID")},
	inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName = "ID")})
	private List<Role> roles;

}

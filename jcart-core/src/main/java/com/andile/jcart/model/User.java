package com.andile.jcart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String password;
	private String passwordResetToken;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = {@JoinColumn(name= "USER_ID",referencedColumnName = "ID")},
	inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName = "ID")})
	private List<Role> roles;

}

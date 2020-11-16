package com.andile.jcart.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false, unique = true)
	@NotEmpty
	private String name;
	@Column(length = 1024)
	private String description;
	@ManyToMany(mappedBy = "roles")
	private List<User> users;
	@ManyToMany
		@JoinTable(name="role_permission",joinColumns = {@JoinColumn(name="ROLES_ID",referencedColumnName = "ID")},
		inverseJoinColumns = {@JoinColumn(name="PERM_ID", referencedColumnName = "ID")})
	private List<Permission> permissions;
}

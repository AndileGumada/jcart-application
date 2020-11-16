package com.andile.jcart.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="permissions")
public class Permission {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(length = 1024)
	private String description;
	@ManyToMany(mappedBy = "permissions")
	private List<Role> roles;
}

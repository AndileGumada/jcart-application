package com.andile.jcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
}

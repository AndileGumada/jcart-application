package com.andile.jcart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(nullable=false, unique=true)
	private String sku;
	@Column(nullable=false)
	private String name;
	private String description;
	@Column(nullable=false)
	private Double price;
	private String imageUrl;
	private boolean disabled;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn = new Date();
	
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;
	
}

package com.andile.jcart.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false, unique=true)
	private String orderNumber;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="order")
	private Set<OrderItem> items;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="cust_id")
	private Customer customer;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="delivery_addr_id")
	private Address deliveryAddress;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="billing_addr_id")
	private Address billingAddress;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="payment_id")
	private Payment payment;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;
}

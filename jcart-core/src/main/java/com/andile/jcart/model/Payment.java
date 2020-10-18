package com.andile.jcart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id;
	@Column(name="cc_number")
	private String ccNumber;
	private String cvv;
	private double amount;
}

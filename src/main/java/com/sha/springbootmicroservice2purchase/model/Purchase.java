package com.sha.springbootmicroservice2purchase.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="purchase")
public class Purchase 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	@Column(name = "course_id", nullable = false)
	private Long courseId;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@Column(name = "purchase_time", nullable = false)
	private LocalDateTime purchaseTime;
	
}

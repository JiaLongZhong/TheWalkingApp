package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity @Data
public class Cart {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CARTID")
	private int id;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="PRODUCTID")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMERID")
	private Customer customer;
	
	
	
}
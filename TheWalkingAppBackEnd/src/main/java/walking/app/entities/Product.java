package walking.app.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity @Data
public class Product {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="PRODUCTID")
	private int id;
	
	@Column(name="PRODUCTNAME")
	private String name;
	
	@Column(name="PRODUCTDESC")
	private String desc;
	
	@Column(name="PRODUCTPRICE")
	private double price;
	
	@Column(name="PRODUCTIMAGE")
	private String image;
	
	@Column(name="PRODUCTSIZE")
	private String size;
	
	@Column(name="PRODUCTSTOCK")
	private int stock;
	
	@ManyToOne 
	@JoinColumn(name="BRANCHID", nullable=false)
	private Branches bid;
	
	@JsonIgnore
	@ManyToMany(mappedBy="product", fetch = FetchType.LAZY)
	private Set<Cart> cart;
	
}
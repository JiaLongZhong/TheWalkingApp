package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Product {
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
	private int size;
	
	@Column(name="PRODUCTSTOCK")
	private int stock;
	
	@Column(name="BRANCHID")
	private int branchID;
}

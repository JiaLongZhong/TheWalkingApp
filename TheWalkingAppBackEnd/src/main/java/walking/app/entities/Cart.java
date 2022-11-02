package walking.app.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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
	
	@Column(name="PRICETAG")
	private int unitcost;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="CART_HAS_PRODUCT", 
	joinColumns= {
			@JoinColumn(name="cart_CartID",referencedColumnName="CartID")
	},
	inverseJoinColumns = {
		    @JoinColumn(name="product_ProductID",referencedColumnName="ProductID")
	})
	private Set<Product> product;
	
}

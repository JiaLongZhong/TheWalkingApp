package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity @Data
public class Cart {
	@Id @Column(name="CARTID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="ORDERID",referencedColumnName="ORDERID", nullable = false)
	private Order oid;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="PRICETAG")
	private int unitcost;
	
}

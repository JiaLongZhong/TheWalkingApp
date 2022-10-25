package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Order {
	@Id @Column(name="ORDERID")
	private int id;
	
	@Column(name="CUSTOMERID")
	private int cid;
	
	@Column(name="PRODUCTID")
	private int pid;
	
	@Column(name="SHIPPINGADDRESS")
	private String shipaddr;
	
	@Column(name="BILLINGADDRESS")
	private String billAddr;
	
	@Column(name="FEEDBACK")
	private String feedback;
}

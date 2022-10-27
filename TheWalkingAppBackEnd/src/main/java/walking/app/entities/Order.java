package walking.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity @Data
public class Order {
	@Id @Column(name="ORDERID")
	private int id;
	
	@Column(name="CUSTOMERID")
	private int cid;
	
	@Column(name="SHIPPINGADDRESS")
	private String shipaddr;
	
	@Column(name="BILLINGADDRESS")
	private String billAddr;
	
	@Column(name="FEEDBACK")
	private String feedback;
	
	@Column(name="ORDERDATE")
	@CreationTimestamp
    private Date orderDate;
	
	@Column(name="DUEDATE")
    private Date dueDate;
	
	@Column(name="NUMBEROFPRODUCT")
	private int numOfProduct;
	
	@Column(name="BRANCHID")
	private int bid;
}

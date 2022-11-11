package walking.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;


import lombok.Data;

@Entity @Data
public class Order {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="ORDERID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMERID", nullable=false)
	private Customer cid;
	
	@Column(name="ORDERDATE")
	@CreationTimestamp
    private Date orderDate;
	
	@Column(name="DUEDATE")
    private Date dueDate;
	
	@Column(name="TOTALCOST")
	private double totalCost;
	
	
	@ManyToOne 
	@JoinColumn(name="BRANCHID", nullable=false)
	private Branches bid;
	
	@OneToOne 
	@JoinColumn(name="ORDERID",referencedColumnName="ORDERID", nullable = false)
	private Cart cartid;
}
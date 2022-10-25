package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity @Data
public class Customer {
	@Id @Column(name="CUSTOMERID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PhoneNumber")
	private String phoneNum;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="FROMOFPAYMENT")
	private String type;
	
	@Column(name="Amount")
	private double balance;
}
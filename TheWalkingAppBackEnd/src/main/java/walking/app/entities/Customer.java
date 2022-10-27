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
	
	@Column(name="PHONENUMBER")
	private String phoneNum;
	
	@Column(name="SHIPPINGADDRESS")
	private String address;
	
	@Column(name="FORMOFPAYMENT")
	private String type;
	
	@Column(name="BALANCE")
	private double balance;
}
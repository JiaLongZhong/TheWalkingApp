package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Branches {

	@Id @Column(name="BRANCHID")
	private int bid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BILLINGADDRESS")
	private String address;
}

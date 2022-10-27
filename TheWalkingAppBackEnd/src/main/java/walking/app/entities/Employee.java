package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Employee {
	@Id @Column(name="EMPLOYEEID")
	private int eid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BRANCHID")
	private int bid;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="MANAGERID")
	private int mid;
	
	@Column(name="WORKINGDAYPERMONTH")
	private int dateWorked;
}

package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Employee {
	@Id @Column(name="EMPLOYEEID")
	private int eid;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="BRANCHID", nullable=false)
	private Branches bid;
	
	@Column(name="SALARY")
	private double salary;
	
	@ManyToOne
	@JoinColumn(name="MANAGERID", nullable=false)
	private Manager mid;
	
	@Column(name="WORKINGDAYPERMONTH")
	private int dateWorked;
}

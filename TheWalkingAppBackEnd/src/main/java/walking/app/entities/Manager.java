package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Manager {
	@Id @Column(name="MANAGERID")
	private int mid;
	
	@Column(name="BRANCHID")
	private int bid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="WORKINGDAYPERMONTH")
	private int dateWorked;
}

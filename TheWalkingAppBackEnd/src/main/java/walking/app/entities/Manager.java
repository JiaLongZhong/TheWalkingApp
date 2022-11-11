package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Manager {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="MANAGERID")
	private int mid;
	
	@ManyToOne
	@JoinColumn(name="BRANCHID", nullable=false)
	private Branches bid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="WORKINGDAYPERMONTH")
	private int dateWorked;
}
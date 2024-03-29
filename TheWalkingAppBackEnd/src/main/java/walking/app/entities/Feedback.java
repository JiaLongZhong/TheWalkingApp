package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Feedback {

	@Id @Column(name="FEEDBACKID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="PRODUCTID", nullable=false)
	private Product pid;
	
	@Column(name="FEEDBACKNAME")
	private String fbTitle;
	
	@Column(name="FEEDBACKBODY")
	private String fbDesc;
	
	@ManyToOne
	@JoinColumn (name= "CUSTOMERID", nullable=false)
	private Customer cid;
}

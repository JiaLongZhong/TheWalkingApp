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
public class Reply {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="REPLYID")
	private int rid;
	
	@Column(name="REPLYNAME")
	private String rTitle;
	
	@Column(name="REPLYBODY")
	private String rDesc;
	
	@ManyToOne
	@JoinColumn(name="FEEDBACKID", nullable=false)
	private Product Fid;
	
}
package walking.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Reply {

	@Id @Column(name="ReplyID")
	private int rid;
	
	@Column(name="ReplyName")
	private String rTitle;
	
	@Column(name="ReplyBody")
	private String rDesc;
	
	@ManyToOne
	@JoinColumn(name="FEEDBACKID", nullable=false)
	private Product Fid;
	
}
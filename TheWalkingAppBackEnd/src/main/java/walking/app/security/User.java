package walking.app.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity @Data
public class User {

	@Id
	@Column(name="USERID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String password;
	private String role;
	private boolean enabled;
	
	
}

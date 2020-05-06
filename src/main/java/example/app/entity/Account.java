package example.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
@Table(name = "springtest.account")
public class Account implements Serializable{

	@Id
	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Transient
	private boolean isEnabled = true;

}

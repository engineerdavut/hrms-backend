package com.davut.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_no")
	private String userNo;
	
	@Column(name="password")
	private String password;
	
	@Column(name="re_password")
	private String rePassword;
	
	public User() {
		
	}
	public User(int id, String userNo, String password, String rePassword) {
		super();
		this.id = id;
		this.userNo = userNo;
		this.password = password;
		this.rePassword = rePassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
        
}

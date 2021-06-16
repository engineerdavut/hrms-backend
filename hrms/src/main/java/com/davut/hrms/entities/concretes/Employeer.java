package com.davut.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employeers")
public class Employeer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String firstName;
	
	@Column(name="company_web_site")
	private String companyWebSite;
	
	@Column(name="company_email")
	private String companyEmail;
	
	@Column(name="phone_number")
	private String phoneNumber;


}

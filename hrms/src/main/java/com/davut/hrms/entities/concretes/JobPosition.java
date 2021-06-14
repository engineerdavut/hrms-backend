package com.davut.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="system_personnel_id")
	private int systemPersonnelId;
	
	@Column(name="position_name")
	private String positionName;
	
	public JobPosition() {
		
	}
	
	public JobPosition(int id, int systemPersonnelId, String positionName) {
		super();
		this.id = id;
		this.systemPersonnelId = systemPersonnelId;
		this.positionName = positionName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSystemPersonnelId() {
		return systemPersonnelId;
	}
	public void setSystemPersonnelId(int systemPersonnelId) {
		this.systemPersonnelId = systemPersonnelId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}

package com.davut.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davut.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}

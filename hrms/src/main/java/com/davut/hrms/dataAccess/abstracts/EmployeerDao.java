package com.davut.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davut.hrms.entities.concretes.Employeer;

public interface EmployeerDao extends JpaRepository<Employeer,Integer>{

}

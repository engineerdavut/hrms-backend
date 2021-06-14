package com.davut.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davut.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{

}

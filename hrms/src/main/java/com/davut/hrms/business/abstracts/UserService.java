package com.davut.hrms.business.abstracts;

import java.util.List;

import com.davut.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
 
}

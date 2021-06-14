package com.davut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davut.hrms.business.abstracts.UserService;
import com.davut.hrms.dataAccess.abstracts.UserDao;
import com.davut.hrms.entities.concretes.User;
@Service

public class UserManager implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}

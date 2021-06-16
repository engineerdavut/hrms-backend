package com.davut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davut.hrms.business.abstracts.EmployeerService;
import com.davut.hrms.core.DataResult;
import com.davut.hrms.core.SuccessDataResult;
import com.davut.hrms.dataAccess.abstracts.EmployeerDao;
import com.davut.hrms.entities.concretes.Employeer;

@Service
public class EmployeerManager implements EmployeerService {
	private EmployeerDao employeerDao;
	
	@Autowired

	public EmployeerManager(EmployeerDao employeerDao) {
		super();
		this.employeerDao = employeerDao;
	}

	@Override
	public DataResult<List<Employeer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employeer>>(this.employeerDao.findAll(),"iş verenler listelendi");
	}

}

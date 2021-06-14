package com.davut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.davut.hrms.business.abstracts.JobPositionService;
import com.davut.hrms.dataAccess.abstracts.JobPositionDao;
import com.davut.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	@Autowired

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}

}

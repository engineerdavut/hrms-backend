package com.davut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davut.hrms.business.abstracts.JobPositionService;
import com.davut.hrms.core.DataResult;
import com.davut.hrms.core.SuccessDataResult;
import com.davut.hrms.dataAccess.abstracts.JobPositionDao;
import com.davut.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	@Autowired

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"listelendi");
	}

}

package com.davut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davut.hrms.business.abstracts.JobSeekerService;
import com.davut.hrms.core.DataResult;
import com.davut.hrms.core.Result;
import com.davut.hrms.core.SuccessDataResult;
import com.davut.hrms.core.SuccessResult;
import com.davut.hrms.dataAccess.abstracts.JobSeekerDao;
import com.davut.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}


	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"iş arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("iş arayan eklendi");
	}

}

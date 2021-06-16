package com.davut.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.davut.hrms.core.DataResult;
import com.davut.hrms.core.Result;
import com.davut.hrms.entities.concretes.JobSeeker;

@Service
public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	
	Result add(JobSeeker jobSeeker);

}

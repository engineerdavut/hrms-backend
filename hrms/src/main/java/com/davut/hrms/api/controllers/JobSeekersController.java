package com.davut.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davut.hrms.business.abstracts.JobSeekerService;
import com.davut.hrms.core.DataResult;
import com.davut.hrms.core.Result;
import com.davut.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	private JobSeekerService jobSeekerService;
	
	@Autowired

	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/add")
	public Result add(JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}

}

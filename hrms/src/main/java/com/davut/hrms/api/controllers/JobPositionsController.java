package com.davut.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davut.hrms.business.abstracts.JobPositionService;
import com.davut.hrms.core.DataResult;
import com.davut.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionsController {
	private JobPositionService jobPositionService;
	@Autowired

	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return  this.jobPositionService.getAll();
	}

}

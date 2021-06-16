package com.davut.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davut.hrms.business.abstracts.EmployeerService;

import com.davut.hrms.core.DataResult;
import com.davut.hrms.entities.concretes.Employeer;

@RestController
@RequestMapping("/api/employeer")
public class EmployeersController {
	private EmployeerService employeerService;
	@Autowired

	public EmployeersController(EmployeerService employeerService) {
		super();
		this.employeerService = employeerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employeer>> getAll(){
		return this.employeerService.getAll();
	}

}

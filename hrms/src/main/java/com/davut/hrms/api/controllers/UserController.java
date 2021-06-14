package com.davut.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davut.hrms.business.abstracts.UserService;
import com.davut.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	@Autowired

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping
	public List<User> getAll(){
		return this.userService.getAll();
	}
	

}

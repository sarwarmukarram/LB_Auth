package com.lb.auth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.accept.MediaTypeFileExtensionResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.auth.entities.User;
import com.lb.auth.repositories.UserRepo;

@RestController
@RequestMapping("/secure/user/")
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@GetMapping(value = "/list")
	public List<User> getUserList() {
		return userRepo.findAll();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<User> addUser(@RequestBody User user) {
		userRepo.save(user);
		return userRepo.findAll();
	}
}

package com.lb.auth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.accept.MediaTypeFileExtensionResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.auth.entities.Role;
import com.lb.auth.repositories.RoleRepo;

@Controller
@RequestMapping("/secure/role/")
public class RoleService {
	@Autowired
	private RoleRepo roleRepo;

	@GetMapping(value = "/list")
	public List<Role> getRoleList() {
		return roleRepo.findAll();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Role> addRole(@RequestBody Role role) {
		roleRepo.save(role);
		return roleRepo.findAll();
	}

}

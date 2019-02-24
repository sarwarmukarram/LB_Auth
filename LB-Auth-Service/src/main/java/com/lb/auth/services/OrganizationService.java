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

import com.lb.auth.entities.Organization;
import com.lb.auth.repositories.OrganizationRepo;

@RestController
@RequestMapping("/secure/org/")
public class OrganizationService {

	@Autowired
	private OrganizationRepo orgReo;

	@GetMapping(value = "/list")
	public List<Organization> getOrgList() {
		return orgReo.findAll();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Organization> addOrg(@RequestBody Organization org) {
		orgReo.save(org);
		return orgReo.findAll();
	}
}

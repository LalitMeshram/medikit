package com.medikit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medikit.dao.RoleDAO;
import com.medikit.model.RoleMaster;

@RestController
@RequestMapping("/api/master")
public class RoleController {

	@Autowired(required = true)
	RoleDAO roleDAO;

	/* to save role */
	@PostMapping("/roles")
	public RoleMaster createRole(@Validated @RequestBody RoleMaster role) {
		return roleDAO.save(role);
	}

	/* get All roles */
	@GetMapping("/roles")
	public List<RoleMaster> getAllRoles() {
		return roleDAO.findAll();
	}

	/* get role by id */
	@GetMapping("/roles/{id}")
	public RoleMaster getRoleById(@PathVariable(value = "id") Integer id) {
		return roleDAO.findOne(id);
	}
	
	

}

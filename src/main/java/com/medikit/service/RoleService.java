package com.medikit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medikit.model.RoleMaster;


public interface RoleService {
/* to save role*/
	public RoleMaster save(RoleMaster role);
	
/* to search  all roles */
	public List<RoleMaster> findAll();
	
/*get role by id*/
	public RoleMaster findOne(Integer id);
	
/*delete role */	
	public void delete(RoleMaster role);
	
}

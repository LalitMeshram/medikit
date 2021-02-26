package com.medikit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medikit.model.RoleMaster;
import com.medikit.repository.RoleRepository;
import com.medikit.service.RoleService;

@Service

public class RoleDAO implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	

	@Override
	public RoleMaster save(RoleMaster role) {
		
		return roleRepository.save(role);
	}

	@Override
	public List<RoleMaster> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public RoleMaster findOne(Integer id) {
		
		return roleRepository.getOne(id);
	}

	@Override
	public void delete(RoleMaster role) {
		roleRepository.delete(role);

	}

}

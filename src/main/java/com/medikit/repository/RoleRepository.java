package com.medikit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medikit.model.RoleMaster;

@Repository
public interface RoleRepository extends JpaRepository<RoleMaster,Integer>{

}

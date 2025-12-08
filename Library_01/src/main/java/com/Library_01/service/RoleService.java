package com.Library_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library_01.entity.Role;
import com.Library_01.respository.RoleRespository;

@Service
public class RoleService {

    @Autowired
    private RoleRespository rr;

    // Create Role
    public String addRole(Role role) {
        rr.save(role);
        return "Role Added Successfully";
    }
    public List<Role> getRole() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}
    
    public String getRole1(int id) {
		// TODO Auto-generated method stub
		rr.findById(id).get();
		return null;
	}
    
    

	public String putRole(int id, Role role) {
		// TODO Auto-generated method stub
		role.setRoleId(id);
		rr.save(role);
		return "Role updated Successfully";
		
	}

    // Delete Role
    public String deleteRole(int id) {
        rr.deleteById(id);
        return "Role Deleted Successfully";
    }

   
 
    
   
    
   
    

	
	


	
}
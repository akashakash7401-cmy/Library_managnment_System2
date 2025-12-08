package com.Library_01.controller;

//public class RoleController {

	
	
	//>RoleController.java

	//package com.TCS.Library.Management.System.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.Library_01.entity.Role;
import com.Library_01.service.RoleService;

	//import com.TCS.Library.Management.System.Entity.Role;
	//import com.TCS.Library.Management.System.Service.RoleService;

	@RestController
	@RequestMapping("role")
	public class RoleController {
    @Autowired
	   private RoleService roleService;

    @PostMapping("roleAdd")
    public String AddtRole(@RequestBody Role role) {
        return roleService.addRole(role);
        
    }
	    @GetMapping("getrole")
	    public List<Role> getRole(){
	        return roleService.getRole(); 
	    }
	    
	    // read all
	    @GetMapping("getrole/{id}")
	    public String getRole1(@PathVariable int id){
	        return roleService.getRole1(id);
	    }

	    // update
	    @PutMapping("putrole/{id}")
	    public String putRole(@PathVariable int id, @RequestBody Role role) {
	        return roleService.putRole(id, role);
	    }

	    // delete
	    @DeleteMapping("deleteRole/{id}")
	    public String deleteRole(@PathVariable int id) {
	        return roleService.deleteRole(id);
	    }

	   
	}



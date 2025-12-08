package com.Library_01.controller;

//public class UserController {

	//>UserController.java

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

import com.Library_01.entity.User;
import com.Library_01.service.UserService;

	//import com.TCS.Library.Management.System.Entity.Users;
	//import com.TCS.Library.Management.System.Service.UserService;

	@RestController
	@RequestMapping("user")
	public class UserController {

		 @Autowired
		     UserService userService;

		    // Create User
		    @PostMapping("usercreate")
		    public String postUsers(@RequestBody User user) {
		        return userService.addUsers(user);   // FIX HERE → single object
		    }

		    // Get all users
		    @GetMapping("userreadall")
		    public List<User> getMethod() {
		      return userService.readAllUsers();
		    }

		    // Update user
		    @PutMapping("userupdate/{id}")
		    public String updateUser(@PathVariable int id, @RequestBody User user) {
		        return userService.updateUser(id, user);
		    }

		    // Delete user
		    @DeleteMapping("delete/{id}")
		    public String deleteuser(@PathVariable int id) {
		        return userService.deleteUser(id);
		    }
		} 



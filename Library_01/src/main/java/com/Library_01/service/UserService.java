package com.Library_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.Library_01.controller.Users;
import com.Library_01.entity.User;
import com.Library_01.respository.UserRespository;

//import com.Library_01.controller.Users;
@Service
public class UserService {
	@Autowired

	private UserRespository ur;
	
	public String addUsers(User users) {
		// TODO Auto-generated method stub
			ur.save(users);
		return "Added User";
	}
	
	public List<User> readAllUsers() {
		// TODO Auto-generated method stub
		return  ur.findAll();
	}
	public String updateUser(int id, User users) {
		// TODO Auto-generated method stub
		//User.setUser_id(id);
		ur.save(users);		
		return "Sucessfully updated";
	}

	
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
		return null;
	}
	}

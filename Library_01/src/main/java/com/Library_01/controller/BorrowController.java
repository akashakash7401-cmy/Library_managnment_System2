package com.Library_01.controller;

//public class BorrowController {

	
	
	//>BorrowController.java

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

import com.Library_01.entity.Borrow;
import com.Library_01.service.BorrowService;
@RestController
@RequestMapping("/borrow")  
	public class BorrowController{
@Autowired
 BorrowService borrowService;
 @PostMapping("add")
	    public String addtBorrow(@RequestBody Borrow borrow) {
	        return borrowService.addBorrow(borrow);
	    }  // read all
	    @GetMapping("get")
	    public List<Borrow> getAll() {
	        return borrowService.getAll();
	    }
	   @PutMapping("update/{id}")
	    public String updateBorrow(@PathVariable int id, @RequestBody Borrow borrow) {
	        return borrowService.updateBorrow(id, borrow);
	    }

	    // delete
	    @DeleteMapping("delete/{id}")
	    public String deleteBorrow(@PathVariable int id) {
	        return borrowService.deleteBorrow(id);
	    }

	    @DeleteMapping("deleteAll")
	    public String deleteAllBorrows() {
	        return borrowService.deleteAllBorrow();
	    }
	}

	

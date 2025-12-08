package com.Library_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library_01.entity.Borrow;
import com.Library_01.respository.BorrowRespository;
@Service
public class BorrowService {

	@Autowired
	private BorrowRespository br;
	public String addBorrow(Borrow borrow) {
		// TODO Auto-generated method stub
		br.save(borrow);
		return "Added";
	}

	public List<Borrow> getAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}
	public String updateBorrow(int id, Borrow borrow) {
		// TODO Auto-generated method stub
		//borrow.setBorrowid(id);
		br.save(borrow);
		return "updated";
	}
	
	public String deleteBorrow(int id) {
		// TODO Auto-generated method stub
		br.deleteById(id);
		return "Deleted";
	}

	public String deleteAllBorrow() {
		// TODO Auto-generated method stub
		br.deleteAll();
		return "Delete all records";
	}
	}



package com.Library_01.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library_01.entity.Borrow;

@Repository
public interface BorrowRespository extends JpaRepository<Borrow,Integer> {

}

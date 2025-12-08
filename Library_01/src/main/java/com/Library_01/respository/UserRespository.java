package com.Library_01.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library_01.entity.User;
@Repository
public interface UserRespository extends  JpaRepository<User,Integer> {

}

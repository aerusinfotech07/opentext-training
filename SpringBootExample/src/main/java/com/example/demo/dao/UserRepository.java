package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByMobile(String mobile); 
	List<User> findByEmailId(String emailId);
	List<User> findByEmailIdAndMobile(String emailId,String mobile);
	List<User> findByAgeBetween(Integer start,Integer end);
	List<User> findByMobileLikeAndAgeGreaterThanOrderByAge(String mobile,Integer start);
	

}

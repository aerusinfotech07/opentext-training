package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	List<User> findAll();
	User findById(Integer id);
	User save(User user);
	boolean deleteById(Integer id);
	
	//aaditional
	List<User> findByMobile(String mobile); 
	List<User> findByEmailId(String emailId);

}

package com.company.dao;

import java.util.List;

import com.company.model.User;

public interface UserDao {
	
	public List<User> getAllUsers();
	public List<User> getAllUsersByMobile(String mobile);
	public List<User> getAllUsersByEmailId(String mobile);
	public List<User> findUsersByFirstNameLike(String firstName);
	public boolean saveUser(User user);
	
	

}

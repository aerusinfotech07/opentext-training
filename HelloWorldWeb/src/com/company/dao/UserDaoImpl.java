package com.company.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.company.model.User;

public class UserDaoImpl implements UserDao {
	List<User> userList=new ArrayList<>();
	
	public UserDaoImpl()
	{
		userList.add(new User(101,"ramesh","sharma","45454545","ramesh@gmail.com"));
		userList.add(new User(102,"kavya","sharma","45454545","kavya@gmail.com"));
		userList.add(new User(103,"sita","sharma","45454545","sita@gmail.com"));
		userList.add(new User(104,"ravan","sharma","564656","ravan@gmail.com"));
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public List<User> getAllUsersByMobile(String mobile) {
		// TODO Auto-generated method stub
		return userList.stream().filter(user->user.getMobile().equals(mobile)).collect(Collectors.toList());
	}

	@Override
	public List<User> getAllUsersByEmailId(String email) {
		// TODO Auto-generated method stub
		return userList.stream().filter(user->user.getEmailId().equals(email)).collect(Collectors.toList());
	}

	@Override
	public List<User> findUsersByFirstNameLike(String firstName) {
		// TODO Auto-generated method stub
		return userList.stream().filter(user->user.getFirstName().contains(firstName)).collect(Collectors.toList());
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return userList.add(user);
	}

}

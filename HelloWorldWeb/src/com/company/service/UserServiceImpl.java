package com.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;
import com.company.model.User;

public class UserServiceImpl implements UserService {
	
	UserDao dao=new UserDaoImpl();

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public List<User> getAllUsersByMobile(String mobile) {
		// TODO Auto-generated method stub
		return dao.getAllUsersByMobile(mobile);
	}

	@Override
	public List<User> getAllUsersByEmailId(String email) {
		// TODO Auto-generated method stub
		return dao.getAllUsersByEmailId(email);
	}

	@Override
	public List<User> findUsersByFirstNameLike(String firstName) {
		// TODO Auto-generated method stub
		return dao.findUsersByFirstNameLike(firstName);
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return dao.saveUser(user);
	}

}

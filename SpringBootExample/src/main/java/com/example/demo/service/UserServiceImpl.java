package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository; 
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> optional=userRepository.findById(id);
		if(optional.isPresent())
		return optional.get();
		else
			return null;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> optional=userRepository.findById(id);
		if(optional.isPresent())
		{
			userRepository.deleteById(id);
			return true;
		}
		else
			return false;
	}

	@Override
	public List<User> findByMobile(String mobile) {
		// TODO Auto-generated method stub
		return userRepository.findByMobile(mobile);
	}

	@Override
	public List<User> findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailId(emailId);
	}

}

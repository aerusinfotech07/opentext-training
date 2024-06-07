package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> findAll() {	
		List<User> userList=userService.findAll();
		if(userList!=null && userList.size()>0)
		return  new ResponseEntity<List<User>>(userList,HttpStatus.OK);
		else
			return  new ResponseEntity<List<User>>(userList,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> save(@RequestBody User user) throws ResourceNotFoundException
	{
		if(user.getId()!=0)
			throw new ResourceNotFoundException("Exception To create User");
		User u=userService.save(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		User user= userService.findById(id);
		if(user!=null)
		return  new ResponseEntity<User>(userService.findById(id),HttpStatus.OK);
		else
			return  new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);		
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> update(@PathVariable Integer id,@RequestBody User user)
	{
		User u= userService.findById(id);
		if(u!=null) {
			u.setId(id);
			u.setFirstName(user.getFirstName());
			u.setLastName(user.getLastName());
			u=userService.save(u);
			return new ResponseEntity<User>(u,HttpStatus.CREATED);
		}
		return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
		
	}
	
	
	
	
	

}

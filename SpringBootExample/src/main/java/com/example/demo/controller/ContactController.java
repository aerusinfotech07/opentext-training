package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

@RestController
public class ContactController {
	
	
	@Autowired
	ContactService  contactService;
	
	@GetMapping("/contacts")
	public List<Contact> getContactList() {
		return contactService.getContactList();
	}

}

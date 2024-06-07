package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactDao;
import com.example.demo.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactDao contactDao;
	
	public List<Contact> getContactList() {
		return contactDao.getContactList();
	}

}

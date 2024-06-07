package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

@Repository
public class ContactDao {

	public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "England"));
        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "Australia"));
        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));
         
        return listContact;
    }

}

package com.contact.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.services.ContactService;
import com.contact.services.ContactServiceImpl;

@RestController
@RequestMapping("/contacts")

public class ContactServiceController {
	@Autowired
	ContactService scv;
	
	@GetMapping("/user/{userID}")
	public List<Contact> getAllCont(@PathVariable("userID") Long id){
		return this.scv.getAllContacts(id);
		
		
	}

}

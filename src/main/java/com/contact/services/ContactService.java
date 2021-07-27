package com.contact.services;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactService {
	
	public List<Contact> getAllContacts(Long userid);

}

package com.contact.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> cont=new ArrayList<>();
	@Override
	public List<Contact> getAllContacts(Long userid) {
		// TODO Auto-generated method stub
		
		cont.add(new Contact(1015L, "jatinary@gmail", "Jatin Arya", 101L));
		cont.add(new Contact(1014L, "kingary@gmail", "Arya", 103L));
		return cont.stream().filter(i->i.getUserID().equals(userid)).collect(Collectors.toList());
	}

}

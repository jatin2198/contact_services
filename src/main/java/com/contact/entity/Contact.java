package com.contact.entity;

public class Contact {
	
	private Long cid;
	
	private String email;
	
	private String contact_name;
	
	private  Long userID;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long cid, String email, String contact_name, Long userID) {
		super();
		this.cid = cid;
		this.email = email;
		this.contact_name = contact_name;
		this.userID = userID;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	

}

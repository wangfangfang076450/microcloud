package com.producer.bean;

public class User {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

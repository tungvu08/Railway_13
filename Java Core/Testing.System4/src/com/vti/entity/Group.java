package com.vti.entity;


import java.time.LocalDate;

public class Group {
	short id;
	String name;
	Account creator;
	LocalDate createDate;
	Account[] accounts;
	
	public Group(short id, String name, Account creator, LocalDate createDate, Account[] accounts) {
		
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	
	public Group(short id, String name, Account creator, String[] userNames, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		Account[] accounts = new Account[userNames.length];
		for (int i = 0; i < userNames.length; i++) {
			accounts[i] = new Account(userNames[i]);
		}
		this.accounts = accounts;
	}
}

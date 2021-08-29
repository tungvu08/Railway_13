package com.vti.entity;

import java.time.LocalDate;

public class Account {
	short id;
	String email;
	String userName;
	String firtName;
	String lastName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] groups;

	public Account(short id, String email, String userName, String firtName, String lastName, Department department,
			Position position) {
		this.id = 1;
		this.email = email;
		this.userName = userName;
		this.firtName = firtName;
		this.lastName = lastName;
		this.fullName = lastName + " " + firtName;
		this.department = department;
		this.position = position;
		this.createDate = LocalDate.now();
		this.groups = groups;
	}

	public String toString() {

		return "id: " + id + "\n" + "email: " + email + "\n" + "user: " + userName + "\n" + "firtname: " + firtName
				+ "\n" + "lastname: " + lastName + "\n" + "tên đầy đủ: " + fullName + "\n" + department + "\n" + position;
	}
	
	public Account(String userName) {
		this.userName = userName;
	}
}
package com.vti.entity;

public class Department {
	byte id;
	String name;

	public Department(byte id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id phòng ban: " + id + " " + "name: " + name;

	}
}

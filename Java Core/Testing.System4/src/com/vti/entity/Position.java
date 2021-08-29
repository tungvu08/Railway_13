package com.vti.entity;


public class Position {
	int id;
	PositionName name;

	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM;
	}
	
	public Position(int id, PositionName name) {
		this.id = 1;
		this.name = PositionName.DEV;
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id position: " + id + " " + "name: " + name;
	}
}
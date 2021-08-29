package com.vti.entity;

public class Test {
public static void main(String[] args) {
	
	getIndex();
}
public static void getIndex() {
	String[] Department = new String[3];
	try {
		System.out.println(Department[5]);
	} catch (Exception e) {
		System.err.println("Cannot find department!");
	}
}
}

package com.vti.backend;

public class Exercise2 {

	public static void Q4() {
	String[] Department = new String[3];
	try {
		System.out.println(Department[5]);
	} catch (Exception e) {
		System.err.println("Cannot find department!");
	}

}
}

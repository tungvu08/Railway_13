package com.vti.entity;

public class TypeQuestion {
	byte id;
	TypeName name;

	public enum TypeName {
		ESSAY, MULTIPLE_CHOICE;
	}
}

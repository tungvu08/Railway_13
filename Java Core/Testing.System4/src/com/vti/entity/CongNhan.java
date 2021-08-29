package com.vti.entity;

public class CongNhan extends CanBo {
	private byte bac;

	public byte getBac() {
		return bac;
	}

	public void setBac(byte bac) {
		this.bac = bac;
	}

	public CongNhan(Short id, String name, int age, Gender gender, String address, byte bac) {
		super(id, name, age, gender, address);
		this.bac = bac;
	}

}

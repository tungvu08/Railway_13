package com.vti.entity;

import java.time.LocalDate;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(String maTaiLieu, String tenNxb, int soBanPhatHanh, String ngayPhatHanh) {
		super(maTaiLieu, tenNxb, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + "]";
	}

}

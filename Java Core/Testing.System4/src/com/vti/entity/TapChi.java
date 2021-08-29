package com.vti.entity;

import java.time.LocalDate;

public class TapChi extends TaiLieu {
	private short soPhatHanh;
	private String thangPhatHanh;

	public short getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(short soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public TapChi(String maTaiLieu, String tenNxb, int soBanPhatHanh, short soPhatHanh, String thangPhatHanh) {
		super(maTaiLieu, tenNxb, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
	}

}

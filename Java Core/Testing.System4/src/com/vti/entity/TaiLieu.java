package com.vti.entity;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNxb;
	private int soBanPhatHanh;

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNxb() {
		return tenNxb;
	}

	public void setTenNxb(String tenNxb) {
		this.tenNxb = tenNxb;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public TaiLieu(String maTaiLieu, String tenNxb, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNxb = tenNxb;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNxb=" + tenNxb + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}

}

package com.vti.entity;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private short soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public short getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(short soTrang) {
		this.soTrang = soTrang;
	}

	public Sach(String maTaiLieu, String tenNxb, int soBanPhatHanh, String tenTacGia, short soTrang) {
		super(maTaiLieu, tenNxb, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + "]";
	}

}

package com.vti.entity;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public KySu(Short id, String name, int age, Gender gender, String address, String nganhDaoTao) {
		super(id, name, age, gender, address);
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id là: " + getId() + "\n" + "tên: " + getName() + "\n" + "tuổi: " + getAge() + "\n" + "Giới tính: "
				+ getGender() + "\n" + "địa chỉ: " + getAddress() + "\n" + "Ngành đào tạo: " + nganhDaoTao;
	}

}

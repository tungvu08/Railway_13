package com.vti.entity;

public class Student {
	private short id;
	private String name;
	private String homeTowe;
	private double point;

	public Student(short id, String name, String homeTowe, Double point) {
		this.id = id;
		this.name = name;
		this.homeTowe = homeTowe;
		this.point = point;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeTowe() {
		return homeTowe;
	}

	public void setHomeTowe(String homeTowe) {
		this.homeTowe = homeTowe;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		String rank = null;
		if (point < 4.0) {
			rank = "học lực yếu";
		}

		else if (point < 6.0) {
			rank = "học lực trung bình";
		}

		else if (point < 8.0) {
			rank = "học lực khá";
		}

		else if (point > 8.0) {
			rank = "học lực giỏi";
			}
			
		return "id: " + id + "\n" + "name: " + name + "\n" + "homtowe: " + homeTowe + "\n" + "point: " + point + "\n" + rank ;
	}

	/*
	 * Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập vào
	 * tên, hometown và có điểm học lực = 0
	 */

	/* c) Tạo 1 method cho phép set điểm vào */

	public void setPoint(Float point) {
		this.point = point;
	}
	/* d) Tạo 1 method cho phép cộng thêm điểm */

	public void Point(Float point) {
		this.point += point;
	}

	/*
	 * e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực
	 * ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0 thì sẽ in ra là
	 * trung bình, nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra
	 * là Giỏi)
	 */

	
	

	}



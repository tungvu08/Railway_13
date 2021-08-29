package com.vti.frontend;

import java.awt.Point;
import java.util.Scanner;

import org.omg.CORBA.ServiceInformation;

import com.vti.backend.QLCB;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;
import com.vti.entity.Student;

public class Main {

	public static void main(String[] args) {
/*Question 2:
		Tạo constructor cho Account:
		Có các parameter là id, Email, Username, FirstName,
LastName (với FullName = FirstName + LastName) và
Position của User, default createDate = now*/
		
//		Position position = new Position(1, PositionName.DEV);
//
//		Department department = new Department((byte) 1, "Marketing");
//
//		Account account = new Account((short) 1, "Tungvu@gmail.com", "tungvu", "tung", "vu thanh", department,
//				position);
//		System.out.println(account);
		

		/*Exercise 4 : Encapsulation*/
//		
//		Student student = new Student((short) 1, "Vũ thanh tùng", "Hà Nội", (double) 10 );
//		System.out.println(student);
		
	//bài QLCB
		QLCB(); 
		
	}
	
	public static void QLCB() {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		System.out.println("---------------------PHẦN MỀM QUẢN LÝ CÁN BỘ---------------------");
		System.out.println("1. Thêm mới cán bộ");
		System.out.println("2. Tìm kiếm cán bộ theo tên");
		System.out.println("3. Hiển thị danh sách cán bộ");
		System.out.println("4. Xóa cán bộ theo tên");
		System.out.println("5. Thoát chương trình");

		byte chucNang;

		do {
			System.out.println("Mời bạn chọn chức năng: (1-5)");
			chucNang = scanner.nextByte();

			switch (chucNang) {
			case 1:
				qlcb.themCanBo();
				break;
			case 2:
				qlcb.timKiemCanBo();
				break;
			case 3:
				qlcb.hienThiDanhSachCanBo();
				break;
			case 4:
				qlcb.xoaCanBoTheoTen();
				break;
			case 5:
				System.out.println("Hẹn gặp lại bạn lần sau!");
				return;
			default:
				System.out.println("Mời bạn nhập lại giá trị trong khoảng 1-5");
				break;
			}
		} while (chucNang != 5);
}
}

package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.Gender;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class QLCB {
	private List<CanBo> canBos;

	public QLCB() {
		canBos = new ArrayList<CanBo>();
	}

// tạo phương thức thêm cán bộ và cho người dùng nhập vào chức năng cán bộ muốn thêm
	public void themCanBo() {
		Scanner scanner = new Scanner(System.in);

		byte loaiCanBo;
// dùng do - while để khi người dùng nhập sai sẽ phải nhập lại
		boolean isloaiCanBo = false;
		do {
			System.out.println("Chọn cán bộ bạn muốn thêm: " + "\n" + "1-Công nhân, 2-Kỹ sư, 3-Nhân viên");
			loaiCanBo = scanner.nextByte();
			switch (loaiCanBo) {
			case 1:
				themCongNhan();
				break;

			case 2:
				themKySu();
				break;

			case 3:
				themNhanVien();
				break;

			default:
				System.out.println("bạn chỉ được nhập 1, 2, 3");
				break;
			}
		} while (isloaiCanBo = false);

	}

	// vì giới tính là enum nên ta tạo thêm 1 phương thức giới tính để người dùng
	// lựa chọn sau đó ta thay phương thức giới tính lần lượt vào các cán bộ.

	public Gender nhapGioiTinh() {
		Scanner scanner = new Scanner(System.in);
		byte gioiTinh;
		do {
			System.out.println("Mời bạn nhập vào giới tính: (1-Nam, 2-Nữ, 3-Không rõ)");
			gioiTinh = scanner.nextByte();

			switch (gioiTinh) {
			case 1:
				return Gender.MALE;

			case 2:
				return Gender.FEMALE;

			case 3:
				return Gender.UNKNOW;

			default:
				System.out.println("xin nhập lại!");
				break;
			}
		} while (gioiTinh < 1 || gioiTinh > 3);

		return null;
	}

	public void themCongNhan() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào id: ");
		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên: ");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi: ");
		byte age = scanner.nextByte();
		scanner.nextLine();

		Gender gender = nhapGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ: ");
		String address = scanner.nextLine();

		byte bac;
		do {
			System.out.println("Mời bạn nhập vào bậc: (1-10) ");
			bac = scanner.nextByte();

			if (bac < 1 || bac > 10) {
				System.out.println("Mời bạn nhập lại bậc từ 1 đến 10");
			}

		} while (bac < 1 || bac > 10);

		CongNhan congNhan = new CongNhan(id, name, age, gender, address, bac);
		canBos.add(congNhan);
		System.out.println("bạn đã thêm thành công Công nhân!" + congNhan);
	}

	public void themKySu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào id: ");

		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên: ");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi: ");
		byte age = scanner.nextByte();
		scanner.nextLine();
		
		Gender gender = nhapGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ: ");
		String address = scanner.nextLine();

		System.out.println("Mời bạn nhập vào ngành đào tạo: ");
		String nganhDaoTao = scanner.nextLine();

		KySu kySu = new KySu(id, name, age, gender, address, nganhDaoTao);
		canBos.add(kySu);
		System.out.println("bạn đã thêm thành công Kỹ sư!" + kySu);
	}

	public void themNhanVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào id: ");

		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên: ");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi: ");
		byte age = scanner.nextByte();
		scanner.nextLine();
		
		Gender gender = nhapGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ: ");
		String address = scanner.nextLine();

		System.out.println("Mời bạn nhập vào công việc: ");
		String congViec = scanner.nextLine();

		NhanVien nhanVien = new NhanVien(id, name, age, gender, address, congViec);
		canBos.add(nhanVien);
		System.out.println("bạn đã thêm thành công Nhân viên!" + nhanVien);
	}

	public void timKiemCanBo() {
		Scanner scanner = new Scanner(System.in);

		byte loaiCanBo;
		boolean isloaiCanBo = false;
		do {
			System.out.println("cán bộ bạn muốn tìm kiếm là: (1 - công nhân, 2 - kỹ sư, 3 - nhân viên");
			loaiCanBo = scanner.nextByte();

			switch (loaiCanBo) {
			case 1:
				timKiemCongNhanTheoTen();
				break;

			case 2:
				timKiemKySuTheoTen();
				break;

			case 3:
				timKiemNhanVienTheoTen();
				break;

			default:
				System.out.println("Mời bạn nhập lại! (Giá trị trong khoảng 1-3)");
				break;
			}
		} while (isloaiCanBo == false);

	}

	public void timKiemCongNhanTheoTen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cần tìm kiếm:");
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		boolean isExist = false;

		for (CanBo congNhan : canBos) {
			if (congNhan.getName().equals(name)) {
				System.out.println((CongNhan) congNhan);
				isExist = true;
			}

			if (isExist = false) {
				System.out.println("Không tìm thấy!");
			}

		}
	}

	public void timKiemKySuTheoTen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cần tìm kiếm:");
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		boolean isExist = false;

		for (CanBo kySu : canBos) {
			if (kySu.getName().equals(name)) {
				System.out.println((KySu) kySu);
				isExist = true;
			}

			if (isExist = false) {
				System.out.println("Không tìm thấy!");
			}

		}

	}

	public void timKiemNhanVienTheoTen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cần tìm kiếm: ");
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		boolean isExist = false;

		for (CanBo nhanVien : canBos) {
			if (nhanVien.getName().equals(name)) {
				System.out.println((NhanVien) nhanVien);
				isExist = true;
			}
			if (isExist = false) {
				System.out.println("Không tìm thấy!");
			}
		}
	}

//hiển thị danh sách cán bộ.
	public void hienThiDanhSachCanBo() {
		if (canBos.size() == 0) {
			System.out.println("Danh sách trống!");
		}

		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i) instanceof CongNhan) {
				System.out.println(canBos.get(i));
			} else if (canBos.get(i) instanceof KySu) {
				System.out.println(canBos.get(i));
			} else {
				System.out.println(canBos.get(i));
			}
		}
	}

	// xóa cán bộ theo tên
	public void xoaCanBoTheoTen() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào tên cán bộ cần xóa:");
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		boolean isExist = false;

		for (CanBo canBo : canBos) {
			if (canBo.getName().toLowerCase().equals(name)) {
				canBos.remove(canBo);
				System.out.println("Xóa thành công!");
				isExist = true;
				break;
			}
		}

		if (isExist == false) {
			System.out.println("Không tìm thấy cán bộ nào có tên là: " + name);
		}
	}
}

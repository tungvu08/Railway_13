package com.vti.backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.TaiLieu;

public class QuanLySach {
	private List<TaiLieu> taiLieus;

	public void QuanLySach() {
		taiLieus = new ArrayList<TaiLieu>();

		Scanner scanner = new Scanner(System.in);
		// thêm mới tài liệu: sách, báo, tạp chí.

		byte loaiTaiLieu;

		boolean isloaiTaiLieu = false;
		do {

			System.out.println("Mời bạn nhập loại tài liệu muốn thêm mới: (1-Sách, 2-Báo, 3-Tạp chí)");
			loaiTaiLieu = scanner.nextByte();

			switch (loaiTaiLieu) {
			case 1:
				themSach();
				break;

			case 2:
				themBao();
				break;

			case 3:
				themTapChi();
				break;

			default:
				System.out.println("Mời bạn nhập lại!");
				break;
			}
		} while (isloaiTaiLieu = false);

	}

//String maTaiLieu, String tenNxb, int soBanPhatHanh, String tenTacGia, short soTrang
	public void themSach() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào mã sách");
		String maTaiLieu = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên NXB");
		String tenNXB = scanner.nextLine();

		System.out.println("Mời bạn nhập vào số bản phát hành");
		int soBanPhatHanh = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên tác giả");
		String tenTacGia = scanner.nextLine();

		System.out.println("Mời bạn nhập vào số trang");
		short soTrang = scanner.nextShort();
	}

	public void themBao() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào mã báo");
		String maTaiLieu = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên NXB");
		String tenNXB = scanner.nextLine();

		System.out.println("Mời bạn nhập vào số bản phát hành");
		int soBanPhatHanh = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào ngày phát hành");
		String ngayPhatHanh = scanner.nextLine();
		LocalDate localDate1 = LocalDate.parse(ngayPhatHanh, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

		Bao bao = new Bao(maTaiLieu, tenNXB, soBanPhatHanh, ngayPhatHanh);
		taiLieus.add(bao);

		System.out.println("bạn đã thêm thành công tài liệu Báo!" + bao);
	}

	public void themTapChi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào mã Tạp Chí");
		String maTaiLieu = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên NXB");
		String tenNXB = scanner.nextLine();

		System.out.println("Mời bạn nhập vào số bản phát hành");
		int soBanPhatHanh = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào số phát hành");
		short soPhatHanh = scanner.nextShort();

		System.out.println("Mời bạn nhập vào ngày phát hành");
		String thangPhatHanh = scanner.nextLine();
		LocalDate localDate1 = LocalDate.parse(thangPhatHanh, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}

	public void xoaTaiLieuTheoMa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập mã tài liệu cần xóa");
		String maTaiLieu = scanner.nextLine();
		maTaiLieu = maTaiLieu.trim().toLowerCase();

		for (TaiLieu taiLieu : taiLieus) {
			if (taiLieu.getMaTaiLieu().toLowerCase().equals(maTaiLieu)) {
				taiLieus.remove(maTaiLieu);
				System.out.println("Bạn đã xóa tài liệu thành công");
			} else {
				System.out.println(
						"Không tìm thấy tài liệu" + "bạn hãy nhập đúng mã tài liệu và bảo đảm viết thường các ký tự");
			}
		}
		
	}
}

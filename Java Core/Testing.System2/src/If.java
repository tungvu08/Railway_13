import java.time.LocalDate;

public class If {
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Kinh doanh";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Kế toán";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Nhân sự";

		// Tạo các vị trí
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 3;
		position4.name = PositionName.PM;

		// Tạo các nhân viên
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "vuthanhtung@gmail.com";
		account1.userName = "tungvu";
		account1.fullName = "Vũ Thanh Tùng";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "hamy91@gmail.com";
		account2.userName = "hamy1910";
		account2.fullName = "Đinh Hà My";
		account2.department = department1;
		account2.position = position2;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hungtay@gmail.com";
		account3.userName = "hungtay";
		account3.fullName = "Hoàng Kim Hùng";
		account3.department = department2;
		account3.position = position3;
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "AnNhiengenz@gmail.com";
		account4.userName = "AnNhien";
		account4.fullName = "Vũ An Nhiên";
		account4.department = department1;
		account4.position = position2;
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "anhhoang@gmail.com";
		account5.userName = "anhhoang93";
		account5.fullName = "Trình Anh Hoàng";
		account5.department = department3;
		account5.position = position3;
		account5.createDate = LocalDate.now();

		Account account6 = new Account();
		account6.id = 6;
		account6.email = "nguyentuan@gmail.com";
		account6.userName = "nguyentuan89";
		account6.fullName = "Nguyễn Văn Tuân";
		account6.department = department2;
		account6.position = position3;
		account6.createDate = LocalDate.now();

		// Tạo các group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhóm đá bóng";
		group1.creator = account3;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nhóm đá cầu";
		group2.creator = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhóm chơi golf";
		group3.creator = account1;
		group3.createDate = LocalDate.now();

		Group[] groupsOfAccount1 = { group1, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group1 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group2, group3 };
		account3.groups = groupsOfAccount3;

		Group[] groupsOfAccount4 = { group1, group3 };
		account4.groups = groupsOfAccount4;

		Group[] groupsOfAccount5 = { group1, group2, group3 };
		account5.groups = groupsOfAccount5;

		Account[] accountsOfGroup1 = { account1, account2, account3, account4, account5 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account1, account3, account4, account5 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account3, account4, account5 };
		group3.accounts = accountsOfGroup3;

		/*
		 * Question 1: Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
		 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
		 * in ra text "Phòng ban của nhân viên này là ..."
		 */

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban!");

		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);

		}
		/*
		 * Question 2: Kiểm tra account thứ 2 _Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" _Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" _Nếu có mặt trong
		 * 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" _Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 */

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int groupOfAccount2 = account2.groups.length;
			if (groupOfAccount2 == 1 || groupOfAccount2 == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");

			}
			if (groupOfAccount2 == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (groupOfAccount2 >= 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

			}
		}
		System.out.println("======================================================");
		/*
		 * Question 3: Sử dụng toán tử ternary để làm Question 1
		 */

		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban!"
				: "Phòng ban của nhân viên này là: " + account2.department.name);
		System.out.println("======================================================");
		/*
		 * Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của
		 * account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không
		 * phải thì in ra text "Người này không phải là Developer"
		 */

		System.out.println(
				account1.position.name == PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer");
		System.out.println("======================================================");
		/*
		 * SWITCH CASE Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra
		 * theo format sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
		 * Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng
		 * account = 3 thì in ra "Nhóm có ba thành viên" Còn lại in ra
		 * "Nhóm có nhiều thành viên"
		 */
		int accountOfGroup = group1.accounts.length;
		switch (accountOfGroup) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;

		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;

		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;

		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
		System.out.println("======================================================");
		/*
		 * Question 6: Sử dụng switch case để làm lại Question 2
		 */
		int groupOfAccount2 = account2.groups.length;
		switch (groupOfAccount2) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;

		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;

		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;

		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
		System.out.println("======================================================");

		/* question 7 */
		String positionName = account1.position.name.name();
		switch (positionName) {
		case "DEV":
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		System.out.println("======================================================");
		/*
		 * FOREACH Question 8: In ra thông tin các account bao gồm: Email, FullName và
		 * tên phòng ban của họ
		 */
		Account[] accounts = { account1, account2, account3, account4, account5, account6 };
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("Name: " + account.fullName);
		}
		System.out.println("======================================================");
		/*
		 * Question 9: In ra thông tin các phòng ban bao gồm: id và name
		 */
		Department[] departments = { department1, department2, department3 };
		for (Department department : departments) {
			System.out.println("ID: " + department.id);
			System.out.println("Name: " + department.name);

		}
		System.out.println("======================================================");
		/*
		 * FOR Question 10: In ra thông tin các account bao gồm: Email, FullName và tên
		 * phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là: Email:
		 * NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale Thông tin
		 * account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B Phòng
		 * ban: Marketting
		 */

		int i = 0;

		for (i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.name);
		}
		System.out.println("======================================================");
		/*
		 * Question 11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng
		 * sau: Thông tin department thứ 1 là: Id: 1 Name: Sale Thông tin department thứ
		 * 2 là: Id: 2 Name: Marketing
		 */
		for (i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + "là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
		System.out.println("======================================================");
		/*
		 * Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		 * Question 10
		 */
		for (i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + "là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
		System.out.println("======================================================");
		/*
		 * Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
		 */
		for (i = 0; i < accounts.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println("Thông tin account thứ: " + (i + 1) + "là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.name);

		}
		System.out.println("======================================================");
		/*
		 * Question 14: In ra thông tin tất cả các account có id < 4
		 */

		for (i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4) {
				System.out.println("Thông tin account thứ: " + (i + 1) + "là: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].department.name);
			}
		}
		System.out.println("======================================================");
		/*
		 * Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
		 */
		for (i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("======================================================");
		/*
		 * WHILE Question 16: In ra thông tin các account bao gồm: Email, FullName và
		 * tên phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là:
		 * Email: NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale Thông tin
		 * account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B Phòng
		 * ban: Marketting
		 */

		while (i < accounts.length) {
			System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.name);
			i++;
		}
		System.out.println("======================================================");
		/*
		 * Question 17: In ra thông tin các phòng ban bao gồm: id và name theo định dạng
		 * sau: Thông tin department thứ 1 là: Id: 1 Name: Sale Thông tin department thứ
		 * 2 là: Id: 2 Name: Marketing
		 */

		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + "là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}
		System.out.println("======================================================");
		/*
		 * Question 18: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		 * Question 10
		 */

		while (i < 2) {
			System.out.println("Thông tin department thứ " + (i + 1) + "là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}
		System.out.println("======================================================");
		/*
		 * Question 19: In ra thông tin tất cả các account ngoại trừ account thứ 2
		 */

		while (i < accounts.length) {
			if (i != 1) {
				System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].department.name);

			}
			i++;
		}
		System.out.println("======================================================");
		/*
		 * Question 20: In ra thông tin tất cả các account có id < 4
		 */

		while (i < accounts.length) {
			if (accounts[i].id < 4) {
				System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].department.name);
			}
			i++;
		}
		System.out.println("======================================================");
		/*
		 * Question 21: In ra các số chẵn nhỏ hơn hoặc bằng 20
		 */

		while (i <= 20) {
			System.out.println(i);
			i += 2;
		}
	}
}

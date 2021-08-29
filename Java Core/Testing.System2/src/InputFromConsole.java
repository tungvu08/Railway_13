import java.time.LocalDate;
import java.util.Scanner;

public class InputFromConsole {
	public static void main(String[] args) {
	}
		/*
		 * Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		 */
	
//	Scanner scanner = new Scanner (System.in);
//	System.out.println("Mời bạn nhập vào 3 số nguyên");
//	System.out.println("nhập số thứ 1: ");
//	int a = scanner.nextInt();
//	
//	System.out.println("nhập số thứ 2: ");
//	int b = scanner.nextInt();
//	
//	System.out.println("nhập số thứ 3: ");
//	int c = scanner.nextInt();
//	
//	System.out.println("Bạn vừa nhập các số nguyên là: " + a + "," + b + "," + c);

		/*
		 * Question 2: Viết lệnh cho phép người dùng nhập họ tên
		 */

//	Scanner scanner1 = new Scanner(System.in);
//	System.out.println("Mời bạn nhập vào họ tên: ");
//	System.out.println("Họ của bạn là: " );
//	String lastname = scanner1.nextLine();
//	System.out.println("Tên của bạn là: " );
//	String name = scanner1.nextLine();
//	System.out.println("Họ tên đầy đủ của bạn là: " + ho + ten);

//	Scanner scanner2 = new Scanner(System.in);
//	System.out.println("Mời bạn nhập vào năm sinh: ");
//	int year = scanner2.nextInt();
//	System.out.println("Mời bạn nhập vào tháng sinh: ");
//	int month = scanner2.nextInt();
//	System.out.println("Mời bạn nhập vào ngày sinh: ");
//	int day = scanner2.nextInt();
//	LocalDate birthday = LocalDate.of(year, month, day);
//	System.out.println("Ngày sinh của bạn là: " + birthday);


	/*
	 * question 5: Viết lệnh cho phép người dùng tạo account (viết thành method) Đối
	 * với property Position, Người dùng nhập vào 1 2 3 4 5 và vào chương trình sẽ
	 * chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM
	 */

//	public static void creatAccount() {
//		Scanner scanner = new Scanner(System.in);
//		Account account = new Account();
//
//		System.out.println("Mời bạn nhập ID: ");
//		account.id = scanner.nextShort();
//		scanner.nextLine();
//
//		System.out.println("Mời bạn nhập email: ");
//		account.email = scanner.nextLine();
//
//		System.out.println("Mời bạn nhập fullname: ");
//		account.fullName = scanner.nextLine();
//
//		System.out.println("Mời bạn nhập username: ");
//		account.userName = scanner.nextLine();
//
//		System.out.println("Mời bạn nhập tên department: ");
//		String departmentName = scanner.nextLine();
//
//		Department[] departments = inputDepartments();
//		for (Department department : departments) {
//			if (departmentName.equals(department.name)) {
//				account.department = department;
//				break;
//			}
//		}
//
//		System.out.println("Mời bạn nhập vào position: ");
//		String positionName = scanner.nextLine();
//
//		Position[] positions = inputPosition();
//		for (Position position : positions) {
//			if (positionName.equals(position.name.toString())) {
//				account.position = position;
//				break;
//			}
//		}
//
//		account.createDate = LocalDate.now();
//
//		System.out.println("Bạn đã tạo account thành công!");
//
//	}
//
//	public static Department[] inputDepartments() {
//		Department department1 = new Department();
//		department1.id = 1;
//		department1.name = "Kinh doanh";
//
//		Department department2 = new Department();
//		department2.id = 2;
//		department2.name = "Kế toán";
//
//		Department department3 = new Department();
//		department3.id = 3;
//		department3.name = "Nhân sự";
//
//		Department[] departments = { department1, department2, department3 };
//		return departments;
//	}
//
//	public static Position[] inputPosition() {
//		;
//		Position position1 = new Position();
//		position1.id = 1;
//		position1.name = PositionName.DEV;
//
//		Position position2 = new Position();
//		position2.id = 2;
//		position2.name = PositionName.TEST;
//
//		Position position3 = new Position();
//		position3.id = 3;
//		position3.name = PositionName.SCRUM_MASTER;
//
//		Position position4 = new Position();
//		position4.id = 3;
//		position4.name = PositionName.PM;
//
//		Position[] positions = { position1, position2, position3, position4 };
//		return positions;
//	}
//
//	/*
//	 * Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)
//	 */
//
	public static void creatDepartment() {
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();

		System.out.println("Mời bạn nhập thông tin phòng ban mới");
		System.out.println("Mời bạn nhập ID: ");
		department.id = scanner.nextByte();
		scanner.nextLine();
		
		System.out.println("mời bạn nhập tên phòng ban: ");
		department.name = scanner.nextLine();

		System.out.println("Bạn đã tạo phòng ban thành công!");

	}
	
//	/*Question 8:
//Viết chương trình thực hiện theo flow sau:
//Bước 1:
//Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//dụng"
//Bước 2:
//Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//department
//Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//lại" và quay trở lại bước 1*/
//	
//	public static void scannerInput() {
//		Scanner scanner = new Scanner(System.in);
//		int scannerChoose = 0;
//		do {
//			System.out.println("Mời bạn nhập chức năng muốn sử dụng!");
//			System.out.println("1: Tạo account \n 2: Tạo Department \n 3: Thoát khỏi đây");
//			scannerChoose = scanner.nextInt();
//			switch (scannerChoose) {
//			case 1:
//				creatAccount();
//				break;
//			case 2:
//				creatDepartment();
//			case 3:
//				System.out.println("Hẹn gặp lại!");
//				break;
//			default:
//				System.out.println("Mời bạn nhập lại");
//				break;
//			}
//		} while (scannerChoose != 3);
//	}
	
	
	/*Question 9:
Viết method cho phép người dùng thêm group vào account theo flow sau:
Bước 1:
In ra tên các usernames của user cho người dùng xem
Bước 2:
Yêu cầu người dùng nhập vào username của account
Bước 3:
In ra tên các group cho người dùng xem
Bước 4:
Yêu cầu người dùng nhập vào tên của group
Bước 5:
Dựa vào username và tên của group người dùng vừa chọn, hãy
thêm account vào group đó .*/
	
	public static Account[] inputAccounts() {
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "vuthanhtung@gmail.com";
		account1.userName = "tungvu";
		account1.fullName = "Vũ Thanh Tùng";
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "hamy91@gmail.com";
		account2.userName = "hamy1910";
		account2.fullName = "Đinh Hà My";
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hungtay@gmail.com";
		account3.userName = "hungtay";
		account3.fullName = "Hoàng Kim Hùng";
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "AnNhiengenz@gmail.com";
		account4.userName = "AnNhien";
		account4.fullName = "Vũ An Nhiên";
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "anhhoang@gmail.com";
		account5.userName = "anhhoang93";
		account5.fullName = "Trình Anh Hoàng";
		account5.createDate = LocalDate.now();

		Account account6 = new Account();
		account6.id = 6;
		account6.email = "nguyentuan@gmail.com";
		account6.userName = "nguyentuan89";
		account6.fullName = "Nguyễn Văn Tuân";
		account6.createDate = LocalDate.now();
		Account[] accounts = {account1, account2, account3, account4, account5, account6};
		
		return accounts;
	}
	
	public static Group[] inputGroup() {
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhóm đá bóng";
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nhóm đá cầu";
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhóm chơi golf";
		group3.createDate = LocalDate.now();
		
		Group[] groups = {group1, group2, group3};
		
		return groups;
	}
	
	public static void inputGroupOfAccount() {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts =inputAccounts();
		Group[] groups = inputGroup();
		int i = 0;
		for (Account account : accounts) {
			System.out.println("username của hệ thống: " + account.userName);
		}
	}
	
}

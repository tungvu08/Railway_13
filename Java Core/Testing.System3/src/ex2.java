import java.time.LocalDate;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5
		 * phần tử theo cú pháp (sử dụng vòng for để khởi tạo):  Email: "Email 1" 
		 * Username: "User name 1"  FullName: "Full name 1"  CreateDate: now
		 */

		AccountEx2[] accounts = new AccountEx2[5];
		for (int i = 0; i < accounts.length; i++) {

			AccountEx2 account = new AccountEx2();
			account.email = "Email " + i;
			account.userName = "Username " + i;
			account.fullName = "Fullname " + i;
			account.creatDate = LocalDate.now();

			System.out.println("thông tin account " + i);
			System.out.println("Email: " + account.email + "\n" + " Username: " + account.userName + "\n" + "FullName: "
					+ account.fullName);
			System.out.println("\n");
		}
	}

}

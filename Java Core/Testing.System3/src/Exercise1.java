import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		division();
		// TODO Auto-generated method stub
		/*
		 * Question 1: Khai báo 2 số lương có kiểu dữ liệu là float. Khởi tạo Lương của
		 * Account 1 là 5240.5 $ Khởi tạo Lương của Account 2 là 10970.055$ Khai báo 1
		 * số int để làm tròn Lương của Account 1 và in số int đó ra Khai báo 1 số int
		 * để làm tròn Lương của Account 2 và in số int đó ra
		 */

//		float a = 5240.5f;
//		float b = 10970.055f;
//		int acc1 = (int) a;
//		int acc2 = (int) b;
//		System.out.println(acc1);
//		System.out.println(acc2);

		/*
		 * Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ
		 * thêm có số 0 ở đầu cho đủ 5 chữ số)
		 */

//		Random random = new Random();//00000
//		int number = random.nextInt(99999);
//		System.out.printf("%05d", number);
//		
		/*
		 * Question 3: //Lấy 2 số cuối của số ở Question 2 và in ra. //Gợi ý: //Cách 1:
		 * convert số có 5 chữ số ra String, sau đó lấy 2 số cuối //Cách 2: chia lấy dư
		 * số đó cho 100
		 */
//		int c = number % 100;
//		System.out.println("Hai số cuối: " + c);

	}

	/*
	 * Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của
	 * chúng
	 */
	public static void division() {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		a = scanner.nextInt();
		System.out.println("Nhập vào số b: ");
		b = scanner.nextInt();
		System.out.println("Thương = " + (float) a/b);
	}
}

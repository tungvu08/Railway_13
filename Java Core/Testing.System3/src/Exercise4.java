import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
//	/*Question 1:
//Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//thể cách nhau bằng nhiều khoảng trắng );*/
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập chuỗi: ");
//		String s1 = scanner.nextLine();
//		String[] words = s1.split(" ");
//		System.out.println("Số kí tự: " + words.length);
//
//
///*Question 2:
//Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;*/
//Scanner scanner2 = new Scanner(System.in);
//
//System.out.println("Mời bạn nhập vào FirtName: " );
//String firtName = scanner2.nextLine();
//
//System.out.println("Mời bạn nhập vào lastname: " );
//String lastName = scanner2.nextLine();
//
//System.out.println("Full Name = " + lastName + firtName);
//
///*Question 3:
//Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//viết hoa chữ cái đầu thì viết hoa lên*/
//
//Scanner sc = new Scanner(System.in);
//System.out.println("Mời bạn nhập vào full name: ");
//String fullName = sc.nextLine();
//
//String firtChar = fullName.substring(0,1).toUpperCase();
//String remainingLetters = fullName.substring(1, fullName.length());
//
//System.out.println(" Bạn nhập vào full name là: " + firtChar + remainingLetters);
//
///*Question 4:
//Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//của người dùng ra
//VD:
//Người dùng nhập vào "Nam", hệ thống sẽ in ra
//"Ký tự thứ 1 là: N"
//"Ký tự thứ 1 là: A"
//"Ký tự thứ 1 là: M"*/
//
//Scanner sc1 = new Scanner(System.in);
//System.out.println("Mời bạn nhập tên: ");
//String name = sc1.nextLine();
//
//for (int i = 0; i < name.length(); i++) {
//	System.out.println("Ký tự thứ " + (i+1) + "\n" +  name.charAt(i));
//}

		/*
		 * Question 5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
		 * dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		 */

//Scanner sc = new Scanner(System.in);
//System.out.println("Mời bạn nhập vào họ: ");
//String lastName = sc.nextLine();
//System.out.println("Mời bạn nhập vào tên: ");
//String firtName = sc.nextLine();
//System.out.println("Xin chào: " + lastName + " " + firtName);
//System.out.println("Họ của bạn là: " + lastName);

		/*
		 * Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
		 * sau đó hệ thống sẽ tách ra họ, tên , tên đệm VD: Người dùng nhập vào
		 * "Nguyễn Văn Nam" Hệ thống sẽ in ra "Họ là: Nguyễn" "Tên đệm là: Văn"
		 * "Tên là: Nam"
		 */

//	Scanner scanner = new Scanner(System.in);
//	System.out.println("tên của bạn là:");
//	String fullName = scanner.nextLine();
//	String[] s = fullName.split("\\s");
//	
//	
//	String firtName = s[0];
//	String lastname = s[s.length - 1];
//	String midname = " ";
//	for (int i = 1; i <= s.length - 2; i++) {
//		midname += s[i];
//		
//	}
//	System.out.println("Họ của bạn là: " + firtName);
//	System.out.println("tên đệm của bạn là: " + midname);
//	System.out.println("Tên của bạn là: " + lastname);

		/*
		 * Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
		 * chuẩn hóa họ và tên của họ như sau: a) Xóa dấu cách ở đầu và cuối và giữa của
		 * chuỗi người dùng nhập vào
		 * 
		 * 3
		 * 
		 * VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành
		 * "nguyễn văn nam" b) Viết hoa chữ cái mỗi từ của người dùng VD: Nếu người dùng
		 * nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
		 */

//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("Mời nhập tên của bạn: ");
//		String name = scanner2.nextLine();
//		name = name.trim(); // xóa khoảng trắng ở đầu và cuối
//
////tạo chuỗi name thành các mảng string qua khoảng trắng
//		String[] arr = name.split(" ");
//// viết hoa chữ cái đầu của từ đầu và dùng vòng lặp for cho các từ sau
//		String word1 = "";
//		for (String a : arr) {
//			word1 += (a.substring(0, 1).toUpperCase() + a.substring(1));
//			word1 += " ";
//		}
//
//		System.out.println("Họ tên đầy đủ sau khi chuẩn hóa: " + word1);

		/*
		 * Question 8: In ra tất cả các group có chứa chữ "Java"
		 */
//		String[] groupNames = { "Java là gì?", "có các ngôn ngữ lập trình nào?", "Học Java có khó không?" };
//
//		for (String groupName : groupNames) {
//			if (groupName.contains("Java")) { // câu 9 in các gr "java" thì thay contains = equals.
//				System.out.println(groupName);
//			}
//		}
		// test
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("nhập số phần tử của mảng: ");
//		int a = scanner.nextInt();
//		scanner.nextLine();
//		String[] nameOfGroups = new String[a];
//		System.out.println("nhập tên các group: \n ");
//		String groupName = scanner.nextLine();
//		for (String groupName : nameOfGroups) {
//			if (groupName.contains("java")) {
//				System.out.println(groupName);
//			}
//		}
		/*
		 * Question 10 (Optional): Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
		 * Nếu có xuất ra “OK” ngược lại “KO”. Ví dụ “word” và “drow” là 2 chuỗi đảo
		 * ngược nhau.
		 */
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" mời nhập chuỗi thứ nhất:");
//		String a = scanner.nextLine();
//		StringBuffer a1 = new StringBuffer(a);
//
//		System.out.println(" mời nhập chuỗi thứ hai:");
//		String b = scanner.nextLine();
//
//		if (a1.reverse().toString().equals(b)) {
//			System.out.println("Đây là hai chuỗi đảo ngược của nhau");
//		} else {
//			System.out.println("không phải là chuỗi đảo ngược của nhau");
//		}

		/*
		 * Question 11 (Optional): Count special Character Tìm số lần xuất hiện ký tự
		 * "a" trong chuỗi
		 */
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào một chuỗi: ");
//		String a = scanner.nextLine();
//		// đặt 1 biến đếm = 0, dùng vòng lặp for, duyệt từng ký tự trong chuỗi bằng
//		// charat có bằng 'a' k.
//		int count = 0;
//		for (int i = 0; i < a.length(); i++) {
//			if ('a' == a.charAt(i)) {
//				count++;
//			}
//		}
//
//		System.out.println("số lần a xuất hiện là: " + count);

		/*
		 * Question 12 (Optional): Reverse String Đảo ngược chuỗi sử dụng vòng lặp
		 */

		Scanner scanner = new Scanner(System.in);
		String reverseS1 = "";
		System.out.println("Mời bạn nhập chuỗi: ");
		String s1 = scanner.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseS1 += s1.charAt(i);
		}
		System.out.println(reverseS1);
	}
}

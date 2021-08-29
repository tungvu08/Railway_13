import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Test a = new Test("tung", "HN");
	 }
	
 public String name;
 public String hometow;
 public Test (String name, String homtow) {
	 this.name = name;
	 this.hometow = homtow;
	 System.out.println(this.name + this.hometow);
 }

//Integer s = 19101991;
//float k = (float) s;
//System.out.printf("%1.3f%n", k);
//
//Integer c = new Integer(1234567);
//int d = c.intValue();
//System.out.println(d);

//Scanner sc = new Scanner(System.in);
//System.out.println("Mời bạn nhập vào full name: ");
//String fullName = sc.nextLine();
//
//String firtChar = fullName.substring(0,1).toUpperCase();
//String remainingLetters = fullName.substring(1, fullName.length());
//
//System.out.println(" Bạn nhập vào full name là: " + firtChar + remainingLetters);

//Scanner scanner = new Scanner(System.in);
//System.out.println("Mời bạn nhập tên: ");
//String name = scanner.nextLine();
//
//for (int i = 0; i < name.length(); i++) {
//	System.out.println("Ký tự thứ " + (i+1) + "\n" +  name.charAt(i));
//}

//Scanner sc = new Scanner(System.in);
//System.out.println("Mời bạn nhập vào họ: ");
//String lastName = sc.nextLine();
//System.out.println("Mời bạn nhập vào tên: ");
//String firtName = sc.nextLine();
//System.out.println("Xin chào: " + lastName + " " + firtName);

//		System.out.println("tên của bạn là:");
//		String fullName = scanner.nextLine();
//		String[] s = fullName.split("\\s");
//		
//		
//		String firtName = s[0];
//		String lastname = s[s.length - 1];
//		String midname = " ";
//		for (int i = 1; i <= s.length - 2; i++) {
//			midname += s[i];
//			
//		}
//		System.out.println("Họ là:" + firtName);
//		System.out.println("tên đệm là: " + midname);
//	
//
//		
//		System.out.println("Tên là:" + lastname);
//		
		// Đặng Văn Hưng

//		Scanner scanner = new Scanner(System.in);
//		String fullName;
//		System.out.println("Nhập họ tên đầy đủ");
//		fullName = scanner.nextLine();
//		scanner.close();
//		fullName = fullName.trim();
//		fullName = fullName.replaceAll("\\s+", " ");
//		System.out.println("test" + fullName);
//		String[] words = fullName.split(" ");
//		fullName = "";
//		for (String word : words) {
//			String firstCharacter = word.substring(0, 1).toUpperCase();
//			String leftCharacter = word.substring(1);
//			word = firstCharacter + leftCharacter;
//			fullName += word;
//		}
//		System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
//
//		// sử dụng class Scanner để nhận dữ liệu từ bàn phím
//		Scanner sc = new Scanner(System.in);
//		String message;
//		System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
//		message = sc.nextLine();
//
//		char[] charArray = message.toCharArray();
//		boolean foundSpace = true;
//		for (int i = 0; i < charArray.length; i++) {
//			if (Character.isLetter(charArray[i])) {
//				if (foundSpace) {
//					charArray[i] = Character.toUpperCase(charArray[i]);
//					foundSpace = false;
//				}
//			} else {
//				foundSpace = true;
//			}
//		}
//		message = String.valueOf(charArray);
//		System.out.println("Chuỗi sau khi đổi: \n" + message);
		
		
//		String stringfromclient = "what happen in your class?";
//		stringfromclient = stringfromclient.trim();
//		//cắt string thành mảng qua các dấu Space
//		String[] arr = stringfromclient.split(" ");
//		//dùng vòng lặp duyệt các từ và thay thế từ đầu tiên!
//		String stringfromclient1 = "";
//		for (String x : arr) {
//			stringfromclient1 += (x.substring(0, 1).toUpperCase() + x.substring(1));
//			stringfromclient1 = stringfromclient1 + " ";
//		}
//		System.out.println("Biến các chữ đầu thành hoa: " + stringfromclient1);
		
	}


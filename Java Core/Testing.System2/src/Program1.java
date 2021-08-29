
import java.time.LocalDate;

public class Program1 {
	public static void main(String[] args) {
		// thông tin account
		// Tạo các phòng ban
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

		// tạo các kiểu câu hỏi
		TypeQuestion typequestion1 = new TypeQuestion();
		typequestion1.id = 1;
		typequestion1.name = TypeName.ESSAY;
		TypeQuestion typequestion2 = new TypeQuestion();
		typequestion2.id = 2;
		typequestion2.name = TypeName.MULTIPLE_CHOICE;

		// tạo CategoryQuestion

		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1;
		category1.name = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2;
		category2.name = "PHP";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.id = 3;
		category3.name = "Python";

		CategoryQuestion category4 = new CategoryQuestion();
		category4.id = 4;
		category4.name = "C++";

		CategoryQuestion category5 = new CategoryQuestion();
		category5.id = 5;
		category5.name = "Kiểu dữ liệu?";

		// tạo Question

		Question q1 = new Question();
		q1.id = 1;
		q1.content = "Java là gì?";
		q1.categoryID = category1;
		q1.createDate = LocalDate.now();
		q1.creatorID = account1;
		q1.type = typequestion1;

		Question q2 = new Question();
		q2.id = 2;
		q2.content = "PHP là gì?";
		q2.categoryID = category2;
		q2.createDate = LocalDate.now();
		q2.creatorID = account1;
		q2.type = typequestion1;

		Question q3 = new Question();
		q3.id = 3;
		q3.content = "Python là gì?";
		q3.categoryID = category3;
		q3.createDate = LocalDate.now();
		q3.creatorID = account3;
		q3.type = typequestion2;

		Question q4 = new Question();
		q4.id = 4;
		q4.content = "C++ là gì?";
		q4.categoryID = category2;
		q4.createDate = LocalDate.now();
		q4.creatorID = account5;
		q4.type = typequestion1;

		Question q5 = new Question();
		q5.id = 5;
		q5.content = "Array là gì?";
		q5.categoryID = category5;
		q5.createDate = LocalDate.now();
		q5.creatorID = account6;
		q5.type = typequestion2;

		// tạo Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Java là 1 ngôn ngữ lập trình";
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "PHP là 1 ngôn ngữ lập trình";
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Python là 1 ngôn ngữ lập trình";
		answer3.isCorrect = true;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "C++ là 1 ngôn ngữ lập trình";
		answer4.isCorrect = true;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "Array chứa một tập hợp giá trị cu=ó cùng kiểu dữ liệu";
		answer5.isCorrect = true;
		// tạo exam
		Exam e1 = new Exam();
		e1.id = 1;
		e1.code = "m01";
		e1.title = "kiểu dữ liệu";
		e1.creatorID = account2;
		e1.categoryID = category1;
		e1.duration = 60;
		e1.createDate = LocalDate.now();

		Exam e2 = new Exam();
		e2.id = 2;
		e2.code = "m02";
		e2.title = "các ngôn ngữ lập trình";
		e2.creatorID = account2;
		e2.categoryID = category2;
		e2.duration = 90;
		e2.createDate = LocalDate.now();

		Exam[] examOfQ1 = { e2 };
		q1.exam = examOfQ1;

		Exam[] examOfQ2 = { e2 };
		q2.exam = examOfQ2;

		Exam[] examOfQ3 = { e2 };
		q3.exam = examOfQ3;

		Exam[] examOfQ4 = { e2 };
		q4.exam = examOfQ4;

		Exam[] examOfQ5 = { e1 };
		q5.exam = examOfQ5;

		Question[] questionOfe1 = { q5 };
		e1.questions = questionOfe1;

		Question[] questionOfe2 = { q1, q2, q3, q4 };
		e2.questions = questionOfe2;

		System.out.println("Thông tin phòng ban 1:");
		System.out.println("ID: " + department1.id);
		System.out.println("Name: " + department1.name);
		
		
		System.out.println("Thông tin vị trí 2:");
		System.out.println("ID: " + position2.id);
		System.out.println("Name: " + position2.name);
	}
}

package Testing.System1;

import java.time.LocalDate;

public class Question {
	byte id;
	String content;
	CategoryQuestion categoryID;
	TypeQuestion type;
	Account creatorID;
	LocalDate createDate;
	Exam[] exam;
}

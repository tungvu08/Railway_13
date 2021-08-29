package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	short id;
	String code;
	String title;
	CategoryQuestion categoryID;
	short duration;
	Account creatorID;
	LocalDate createDate;
	Question[] questions;
}
	
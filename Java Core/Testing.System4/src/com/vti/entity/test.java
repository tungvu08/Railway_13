package com.vti.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		themBao();
	
		
	}

	public static void themBao() {

		String date;
		boolean isdate = false;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Mời bạn nhập vào ngày tháng");
			date = scanner.nextLine();
			
			LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
			System.out.println(" bạn nhập vào ngày tháng" + localDate1);
			
			if (date == localDate1.toString()) {
				System.out.println("bạn đã nhập: " + localDate1);
			} else {
				System.out.println("Mời bạn nhập lại đúng định dạng");
			}
		} while (isdate = false);


		/*
		 * Date a = null; SimpleDateFormat simpleDateFormat = new
		 * SimpleDateFormat("MM");
		 * 
		 * try { a = simpleDateFormat.parse(scanner.nextLine()); } catch (ParseException
		 * e) { } System.out.println("Bạn đã nhập ngày tháng thành công: " +
		 * simpleDateFormat.format(a));
		 */
	
}
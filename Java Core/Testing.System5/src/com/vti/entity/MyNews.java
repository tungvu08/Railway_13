package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
	Scanner sc = new Scanner(System.in);
	private List<News> listNews;

	public MyNews() {
		listNews = new ArrayList<News>();
	}

	public void menu() {
		int choose;

			System.out.println(
					"Mời bạn lựa chọn chức năng muốn sử dụng: (1-Insert news, 2-View list news, 3-Average rate, 4-Exit");
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Nhập vào Title");
				String title = sc.nextLine();

				System.out.println("Nhập vào PublishDate");
				String publishDate = sc.nextLine();

				System.out.println("Nhập vào Author");
				String author = sc.nextLine();

				System.out.println("Nhập vào Content");
				String content = sc.nextLine();

				System.out.println("Nhập vào đánh giá 1");
				int rate1 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 2");
				int rate2 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 3");
				int rate3 = sc.nextInt();
				int[] rates = { rate1, rate2, rate3 };
				
				News news = new News(title, publishDate, author, content, rates);

				listNews.add(news);
				break;

			case 2:
				for (News news1 : listNews) {
					news1.display();
				}
				break;
			case 3:
				
			default:
				break;
			}
		
	}
}

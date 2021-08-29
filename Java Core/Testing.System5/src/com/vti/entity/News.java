package com.vti.entity;

public abstract class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private Float averageRate;
	private int[] rates;

	public News(int id, String title, String publishDate, String author, String content, Float averageRate,
			int[] rates) {
		
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rates = rates;
	}

	public int[] getRate() {
		return rates;
	}

	public void setRate(int[] rate) {
		this.rates = rates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Float getAverageRate() {
		return averageRate;
	}

	public void display() {
		System.out.println(getTitle() + getPublishDate() + getAuthor() + getContent() + getAverageRate());
	}
	
	public float calculate(int rates) {
		averageRate = (float) ((rates[0] + rates[1] + rates[2]) / 3);
		return averageRate;
		}

	
}

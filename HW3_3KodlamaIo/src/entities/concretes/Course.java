package entities.concretes;

import entities.abstracts.Entity;

public class Course implements Entity{


	private Integer id;
	private String name;
	private String courseDetails;
	private double price;
	private Category category;
	
	
	public Course() {}
	
	public Course(Integer id, String name, String courseDetails,double price, Category category) {
		this.id = id;
		this.name = name;
		this.courseDetails = courseDetails;
		this.price=price;
		this.category=category;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", courseDetails=" + courseDetails + ", price=" + price
				+ "Category="+category.toString()+ "]\n";
	}


	
}

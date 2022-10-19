package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{

	List<Course> courses = new ArrayList<>();
	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " is added with Jdbc");
		courses.add(course);
		
		
	}

	@Override
	public void listCourses() {
		System.out.println(courses.toString()+"\n");
	}

}

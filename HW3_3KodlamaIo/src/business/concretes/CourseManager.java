package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CourseService;
import core.Logger;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {
	CourseDao courseDao;
	Logger[] logger;
	List<Course> courses = new ArrayList<>();
	
	public CourseManager(CourseDao courseDao,Logger[] logger) {

		this.courseDao = courseDao;
		this.logger=logger;
	}

	@Override
	public void add(Course course) throws Exception {
		if(controlPrice(course.getPrice())&&nameControl(course.getName())){
			courseDao.add(course);
			courses.add(course);
			for(Logger logs:logger)
				logs.log();
		}
		else if(!nameControl(course.getName()))
			throw new Exception("Name is already exist");
		else if(!controlPrice(course.getPrice()))
			throw new Exception("Price must be bigger than '0' for "+course.getName());
		
	}

	@Override
	public void listCourses() {
		courseDao.listCourses();

	}
	
	protected boolean controlPrice(double price) {
		if(price<0) {
			return false;
		}
		else
			return true;
	}
	
	protected boolean nameControl(String name){
			for (Course course : courses) {
				if(name == course.getName()) {
					return false;	
				}
			}
			return true;
		
	}
}
	

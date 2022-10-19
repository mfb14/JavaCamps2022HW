package business.abstracts;

import entities.concretes.Course;

public interface CourseService {

	public void add(Course course) throws Exception;
	public void listCourses();
	
}

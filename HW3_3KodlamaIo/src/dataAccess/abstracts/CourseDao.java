package dataAccess.abstracts;



import entities.concretes.Course;

public interface CourseDao {

	
	public void add(Course course);
	public void listCourses();

}

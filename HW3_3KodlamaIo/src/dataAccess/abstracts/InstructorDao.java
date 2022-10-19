package dataAccess.abstracts;



import entities.concretes.Instructor;

public interface InstructorDao {

	public void add(Instructor instructor);
	public void listInstructors();
}

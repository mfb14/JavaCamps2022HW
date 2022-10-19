package business.abstracts;

import entities.concretes.Instructor;

public interface InstructorService {

	public void add(Instructor instructor) throws Exception;
	
	public boolean isExist(String name);
	
	public void listInstructors();
}

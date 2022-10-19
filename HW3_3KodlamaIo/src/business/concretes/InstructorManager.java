package business.concretes;


import java.util.ArrayList;
import java.util.List;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class InstructorManager implements InstructorService {

	InstructorDao instructorDao;
	List<Instructor> instructors = new ArrayList<Instructor>();
	
	
	public InstructorManager(InstructorDao instructorDao) {
	
		this.instructorDao = instructorDao;
	}

	@Override
	public void add(Instructor instructor) throws Exception {		
		
		if(isExist(instructor.getName())==true) {
			instructorDao.add(instructor);
			instructors.add(instructor);
		}
		else throw new Exception("The Instructor Already Exsist!!");

		
	}

	@Override
	public boolean isExist(String name) {
		for(Instructor instructor: instructors) {
			if(instructor.getName()==name) {
				return false;
			}
		}
		return true;
		
			
	}

	@Override
	public void listInstructors() {
		
		instructorDao.listInstructors();
	}

}

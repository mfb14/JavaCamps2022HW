package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	List<Instructor> instructors = new ArrayList<>();
	@Override
	public void add(Instructor instructor) {
		System.out.println("Instrcutor Added with Jdbc!");
		instructors.add(instructor);

	}

	@Override
	public void listInstructors() {
		for(Instructor ins:instructors)
			System.out.println(ins.toString());
	}

}

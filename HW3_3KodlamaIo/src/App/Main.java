package App;

import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import dataAccess.concretes.HibernateCategoryDao;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.JdbcInstructorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Instructor ins1 = new Instructor(1, "Engin Demiroğ", "mail", "12345");
		Instructor ins2 = new Instructor(2, "Mustafa Bilen", "mail", "12345");
		
		InstructorManager insMan = new InstructorManager(new JdbcInstructorDao());
		insMan.add(ins1);
		insMan.add(ins2);
		insMan.listInstructors();
		
		Category cat1 = new Category(1, "Software");
		Category cat2 = new Category(2, "Self-Development");
		Category cat3 = new Category(3, "Software");
		
		CategoryService catMan = new CategoryManager(new HibernateCategoryDao());
		catMan.add(cat1);
		catMan.add(cat2);
		catMan.add(cat3);
		
		Logger [] logs = {new FileLogger(),new DatabaseLogger()};
		
		Course crs1 = new Course(1, "Java Course", "Kodlamaio Java Camp", 15, cat1);
		Course crs2 = new Course(2, "c# Course", "Kodlamaio Java Camp", 15, cat1);
		Course crs3 = new Course(3, "Diction Course ", "Oratory and Diction ", 10, cat2);
		Course crs4 = new Course(4, "Java Course", "Kodlamaio Java Camp", 15, cat1);
		Course crs5 = new Course(5, "Java", "Kodlamaio Java Camp", -1, cat3);
		
		CourseService crsMan = new CourseManager(new HibernateCourseDao(), logs);
		crsMan.add(crs1);
		crsMan.add(crs2);
		crsMan.add(crs3);
		crsMan.add(crs4);
		crsMan.add(crs5);
		
		
		crsMan.listCourses();
		
	}

	
}

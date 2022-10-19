package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	protected List<Category> categories = new ArrayList<Category>();
	@Override
	public void add(Category category) {
		if(isExist(category.getName())) {
			System.out.println("Category added with Hibernate!");
			categories.add(category);
		}
		else {
			System.out.println("Category name is already exist");
		}
		

		
	}
	protected boolean isExist(String name) {
		for(Category names: categories) {
			if(name==names.getName()) {
				return false;
				
			}	
		}
		return true;
	}

}

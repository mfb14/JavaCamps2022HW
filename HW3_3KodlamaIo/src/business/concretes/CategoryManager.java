package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class CategoryManager implements CategoryService{

	CategoryDao categoryDao;
	List<Category> categories = new ArrayList<Category>();
	
	public CategoryManager(CategoryDao categoryDao){
		this.categoryDao=categoryDao;
	}
	@Override
	public void add(Category category) throws Exception {
		
		if (category.getName().isEmpty()) {
			throw new Exception("Category name cannot be empty");
		}
		else {
			categoryDao.add(category);
		}
		
	}

}

package com.prasanna.shoppingbackend.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prasanna.shoppingbackend.DAO.CategoryDAO;
import com.prasanna.shoppingbackend.DTO.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("This is the telivision section");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobiles");
		category.setDescription("This is the mobile section");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is the Laptop section");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			if(category.getId() == id ) {
				return category;
			}
		}
		return null;
	}

}

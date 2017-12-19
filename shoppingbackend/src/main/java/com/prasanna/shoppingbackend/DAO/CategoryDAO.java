package com.prasanna.shoppingbackend.DAO;

import java.util.List;

import com.prasanna.shoppingbackend.DTO.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}

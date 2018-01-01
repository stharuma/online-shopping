package net.stharuma.shoppingbackend.dao;

import java.util.List;

import net.stharuma.shoppingbackend.dto.Category;

public interface CategoryDAO {
	boolean add(Category category);
	boolean delete(Category category);
	boolean update(Category category);
	List<Category> list();
	Category get(int id);

}

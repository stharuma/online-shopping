package net.stharuma.shoppingbackend.dao;

import java.util.List;

import net.stharuma.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);

}

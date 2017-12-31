package net.stharuma.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.stharuma.shoppingbackend.dao.CategoryDAO;
import net.stharuma.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Televetion");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.ping");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.ping");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for labtop");
		category.setImageURL("CAT_3.ping");
		
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category: categories){
			if(category.getId()== id) 
				return category;
			
		}
		return null;
	}

}

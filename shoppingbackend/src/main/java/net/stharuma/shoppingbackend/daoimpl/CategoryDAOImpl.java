package net.stharuma.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.stharuma.shoppingbackend.dao.CategoryDAO;
import net.stharuma.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private static List<Category> categories = new ArrayList<>();
	/*
	 * static { Category category = new Category(); category.setId(1);
	 * category.setName("Televetion");
	 * category.setDescription("This is some description for television");
	 * category.setImageURL("CAT_1.ping");
	 * 
	 * categories.add(category);
	 * 
	 * category = new Category(); category.setId(2); category.setName("Mobile");
	 * category.setDescription("This is some description for mobile");
	 * category.setImageURL("CAT_2.ping");
	 * 
	 * categories.add(category);
	 * 
	 * category = new Category(); category.setId(3); category.setName("Laptop");
	 * category.setDescription("This is some description for labtop");
	 * category.setImageURL("CAT_3.ping");
	 * 
	 * categories.add(category); }
	 */

	@Override
	public List<Category> list() {
		String selectActiveCategory ="FROM Category WHERE active = :active";
		Query query =sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}

	/*
	 * getting of single category based on id
	 */
	@Override
	public Category get(int id) {
		// enhanced for loop
		/*
		 * for(Category category: categories){ if(category.getId()== id) return
		 * category;
		 * 
		 * }
		 */
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/*
	 * delete a single category
	 */
	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	/*
	 * update a single category
	 */

	@Override
	public boolean update(Category category) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}

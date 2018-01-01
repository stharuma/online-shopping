package net.stharuma.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.stharuma.shoppingbackend.dao.CategoryDAO;
import net.stharuma.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.stharuma.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*
	 * @Test public void textAddCategory(){ category = new Category();
	 * category.setName("Televetion1");
	 * category.setDescription("This is some description for television");;
	 * category.setImageURL("CAT_1.ping");
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void TestGetCategory(){ category= categoryDAO.get(3);
	 * assertEquals("Successfully fetched a single category from the table"
	 * ,"Mobile",category.getName()); }
	 */

	/*
	 * @Test public void TestUpdateCategory(){ category= categoryDAO.get(3);
	 * category.setName("M123");
	 * assertEquals("Successfully updated a single category from the table",true
	 * ,categoryDAO.update(category)); }
	 */
	/*
	 * @Test public void TestDeleteCategory(){ category= categoryDAO.get(3);
	 * assertEquals("Successfully deleted a single category from the table",true
	 * ,categoryDAO.delete(category)); }
	 */

	/*@Test
	public void TestListCategory() {
		assertEquals("Successfully fetched list of categories from the table", 3, categoryDAO.list().size());
	}*/
	
	@Test
	public void TestCRUDCategory() {
		//add operation
		category = new Category();
		category.setName("Televetion");
		category.setDescription("This is some description for television");;
		category.setImageURL("CAT_1.ping");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is some description for television");;
		category.setImageURL("CAT_mobile.ping");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		// fetching and updating the category
			category= categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully updated a single category from the table",true,categoryDAO.update(category));
		//deleted the category
		assertEquals("Successfully deleted a single category from the table",true ,categoryDAO.delete(category));
		//fetching the list
		assertEquals("Successfully fetched list of categories from the table", 1, categoryDAO.list().size());
	}

}

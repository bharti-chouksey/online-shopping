package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		// context.scan("net.kzn.shoppingbackend.config");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory(){ Category category = new Category();
	 * category.setName("Mobile");
	 * category.setDescription("This is some description for Mobile");
	 * category.setImageURL("CAT_2.png");
	 * 
	 * assertEquals("Successfully added a category inside the table..!!!",true,
	 * categoryDAO.add(category)); }
	 */
	/*
	 * @Test public void testGetCategory() { category = categoryDAO.get(2);
	 * assertEquals("Successfully Fatched a single category from the table..!!!"
	 * ,"Mobile",category.getName()); }
	 */
	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.get(1);
	 * category.setName("TV");
	 * assertEquals("Successfully Updated a single category in the table..!!!"
	 * ,true,categoryDAO.update(category)); }
	 */
	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.get(1);
	 * category.setName("TV");
	 * assertEquals("Successfully delete a single category in the table..!!!"
	 * ,true,categoryDAO.delete(category)); }
	 */
	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fatched the list of categories from the table..!!!"
	 * ,1,categoryDAO.list().size()); }
	 */
	@Test
	public void testCRUDCategory() {
		// adding the category
		Category category = new Category();
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added a category inside the table..!!!", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for TeleVision");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added a category inside the table..!!!", true, categoryDAO.add(category));

		// Featching and Updateing the category
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully Updated a single category in the table..!!!", true, categoryDAO.update(category));

		//delete the category
		 assertEquals("Successfully delete a single category in the table..!!!",true,categoryDAO.delete(category)); 
		 
		 //fetching the list
		 assertEquals("Successfully fatched the list of categories from the table..!!!" ,1,categoryDAO.list().size());
		

	}

}

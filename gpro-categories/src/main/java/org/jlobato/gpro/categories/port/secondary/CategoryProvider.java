package org.jlobato.gpro.categories.port.secondary;

import java.util.List;

import org.jlobato.gpro.categories.domain.Category;

// TODO: Auto-generated Javadoc
/**
 * The Interface CategoryProvider.
 */
public interface CategoryProvider {

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Category> getAll();
	
	/**
	 * Gets the category.
	 *
	 * @param id the id
	 * @return the category
	 */
	public Category getCategory(int id);
	
	/**
	 * Gets the category by code.
	 *
	 * @param code the code
	 * @return the category by code
	 */
	public Category getCategoryByCode(String code);
	
	/**
	 * Gets the category by alt code.
	 *
	 * @param altCode the alt code
	 * @return the category by alt code
	 */
	public Category getCategoryByAltCode(String altCode);
	
	/**
	 * Adds the category.
	 *
	 * @param category the category
	 */
	public void addCategory(Category category);
	
	/**
	 * Update category.
	 *
	 * @param category the category
	 */
	public void updateCategory(Category category);
	
	/**
	 * Removes the category.
	 *
	 * @param id the id
	 */
	public void removeCategory(int id);


	
}

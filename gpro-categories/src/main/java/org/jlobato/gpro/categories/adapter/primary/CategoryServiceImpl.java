package org.jlobato.gpro.categories.adapter.primary;

import java.util.List;

import org.jlobato.gpro.categories.domain.Category;
import org.jlobato.gpro.categories.port.primary.CategoryService;
import org.jlobato.gpro.categories.port.secondary.CategoryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class CategoryServiceImpl.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryProvider categoryProvider;

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public List<Category> getAll() {
		return categoryProvider.getAll();
	}

	/**
	 * Gets the category.
	 *
	 * @param id the id
	 * @return the category
	 */
	@Override
	public Category getCategory(int id) {
		return categoryProvider.getCategory(id);
	}

	/**
	 * Gets the category by code.
	 *
	 * @param code the code
	 * @return the category by code
	 */
	@Override
	public Category getCategoryByCode(String code) {
		return categoryProvider.getCategoryByCode(code);
	}

	/**
	 * Gets the category by alt code.
	 *
	 * @param altCode the alt code
	 * @return the category by alt code
	 */
	@Override
	public Category getCategoryByAltCode(String altCode) {
		return categoryProvider.getCategoryByAltCode(altCode);
	}

	/**
	 * Adds the category.
	 *
	 * @param category the category
	 */
	@Override
	public void addCategory(Category category) {
		// Algo de validación previa no?
		categoryProvider.addCategory(category);
	}

	/**
	 * Update category.
	 *
	 * @param category the category
	 */
	@Override
	public void updateCategory(Category category) {
		// Algo de validación previa no?
		categoryProvider.updateCategory(category);
	}

	/**
	 * Removes the category.
	 *
	 * @param category the category
	 */
	@Override
	public void removeCategory(Category category) {
		// Algo de validación previa no?
		this.removeCategory(category.getIdCategory());
	}

	/**
	 * Removes the category.
	 *
	 * @param id the id
	 */
	@Override
	public void removeCategory(int id) {
		// Algo de validación previa no?
		categoryProvider.removeCategory(id);
	}

}

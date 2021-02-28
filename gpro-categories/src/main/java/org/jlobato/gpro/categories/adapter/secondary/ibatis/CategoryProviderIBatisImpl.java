package org.jlobato.gpro.categories.adapter.secondary.ibatis;

import java.util.ArrayList;
import java.util.List;

import org.jlobato.gpro.categories.converters.CategoryIBatisToCategoryMapper;
import org.jlobato.gpro.categories.domain.Category;
import org.jlobato.gpro.categories.port.secondary.CategoryProvider;
import org.jlobato.gpro.dao.mybatis.facade.FachadaCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * The Class CategoryProviderIBatisImpl.
 */
@Repository
public class CategoryProviderIBatisImpl implements CategoryProvider {
	
	/** The ibatis category provider. */
	@Autowired
	private FachadaCategory ibatisCategoryProvider;
	
	/** The mapper. */
	@Autowired
	private CategoryIBatisToCategoryMapper mapper;

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public List<Category> getAll() {
		// Aquí es donde necesito un converter
		List<org.jlobato.gpro.dao.mybatis.model.Category> cats = ibatisCategoryProvider.getCategories();
		List<Category> result = new ArrayList<>();
		cats.forEach(category -> result.add(mapper.categoryIBatisToCategory(category)));
		return result;
	}

	/**
	 * Gets the category.
	 *
	 * @param id the id
	 * @return the category
	 */
	@Override
	public Category getCategory(int id) {
		return mapper.categoryIBatisToCategory(ibatisCategoryProvider.getCategory((short)id));
	}

	/**
	 * Gets the category by code.
	 *
	 * @param code the code
	 * @return the category by code
	 */
	@Override
	public Category getCategoryByCode(String code) {
		return mapper.categoryIBatisToCategory(ibatisCategoryProvider.getCategoryByCode(code));
	}

	/**
	 * Gets the category by alt code.
	 *
	 * @param altCode the alt code
	 * @return the category by alt code
	 */
	@Override
	public Category getCategoryByAltCode(String altCode) {
		return mapper.categoryIBatisToCategory(ibatisCategoryProvider.getCategoryByAltCode(altCode));
	}

	/**
	 * Adds the category.
	 *
	 * @param category the category
	 */
	@Override
	public void addCategory(Category category) {
		ibatisCategoryProvider.addCategory(mapper.categoryToCategoryIBatis(category));
	}

	/**
	 * Update category.
	 *
	 * @param category the category
	 */
	@Override
	public void updateCategory(Category category) {
		ibatisCategoryProvider.updateCategory(mapper.categoryToCategoryIBatis(category));
	}

	/**
	 * Removes the category.
	 *
	 * @param id the id
	 */
	@Override
	public void removeCategory(int id) {
		ibatisCategoryProvider.removeCategory((short)id);
	}

}

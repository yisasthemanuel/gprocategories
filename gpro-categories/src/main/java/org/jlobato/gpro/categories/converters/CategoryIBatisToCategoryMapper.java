package org.jlobato.gpro.categories.converters;

import org.jlobato.gpro.categories.domain.Category;
import org.mapstruct.Mapper;

/**
 * The Interface CategoryIBatisToCategoryMapper.
 */
@Mapper(componentModel = "spring")
public interface CategoryIBatisToCategoryMapper {
	
	/**
	 * Category IBatis to Category.
	 *
	 * @param category the category
	 * @return the category
	 */
	Category categoryIBatisToCategory(org.jlobato.gpro.dao.mybatis.model.Category category);
	
	/**
	 * Category to Category IBatis.
	 *
	 * @param category the category
	 * @return the org.jlobato.gpro.dao.mybatis.model. category
	 */
	org.jlobato.gpro.dao.mybatis.model.Category categoryToCategoryIBatis(Category category);
}

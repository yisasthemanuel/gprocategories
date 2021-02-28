package org.jlobato.gpro.categories.converters;

import org.jlobato.gpro.categories.adapter.primary.web.CategoryRequest;
import org.jlobato.gpro.categories.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The Interface CategoryRequestConverter.
 */
@Mapper(componentModel = "spring")
public interface CategoryRequestConverter {
	
	/**
	 * Convert category request to categroy.
	 *
	 * @param request the request
	 * @return the category
	 */
	@Mapping(source = "id", target = "idCategory")
	@Mapping(source = "level", target = "lvlCategory")
	@Mapping(source = "code", target = "codeCategory")
	@Mapping(source = "altCode", target = "codeAltCategory")
	@Mapping(source = "description", target = "descriptionCategory")
	Category convertCategoryRequestToCategory(CategoryRequest request);
	
	/**
	 * Convert category to categroy request.
	 *
	 * @param category the category
	 * @return the category request
	 */
	@Mapping(source = "idCategory", target = "id")
	@Mapping(source = "lvlCategory", target = "level")
	@Mapping(source = "codeCategory", target = "code")
	@Mapping(source = "codeAltCategory", target = "altCode")
	@Mapping(source = "descriptionCategory", target = "description")
	CategoryRequest convertCategoryToCategoryRequest(Category category);

}

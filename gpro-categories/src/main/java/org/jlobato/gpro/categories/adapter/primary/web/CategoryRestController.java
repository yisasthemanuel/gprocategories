package org.jlobato.gpro.categories.adapter.primary.web;

import java.util.List;

import org.jlobato.gpro.categories.converters.CategoryRequestConverter;
import org.jlobato.gpro.categories.domain.Category;
import org.jlobato.gpro.categories.port.primary.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class CategoryRestController.
 */
@RestController
@RequestMapping("/categories")
@Component
@Slf4j
public class CategoryRestController {
	
	/** The category service. */
	@Autowired
	private CategoryService categoryService;
	
	/** The converter. */
	@Autowired
	private CategoryRequestConverter converter;
	
    /**
     * Gets the all courses.
     *
     * @return the all courses
     */
    @GetMapping
    public List<Category> getAllCourses() {
    	log.debug("getAllCourses()");
        return categoryService.getAll();
    }
    
    /**
     * Gets the category.
     *
     * @param id the id
     * @return the category
     */
    @GetMapping(value = "/{id}")
    public Category getCategory(@PathVariable int id) {
    	return categoryService.getCategory(id);
    }
    
    /**
     * Gets the category by code.
     *
     * @param code the code
     * @return the category by code
     */
    @GetMapping(value = "/bycode/{code}")
    public Category getCategoryByCode(@PathVariable String code) {
    	return categoryService.getCategoryByCode(code);
    }

    /**
     * Gets the category by alt code.
     *
     * @param altCode the alt code
     * @return the category by alt code
     */
    @GetMapping(value = "/byaltcode/{altCode}")
    public Category getCategoryByAltCode(@PathVariable String altCode) {
    	return categoryService.getCategoryByAltCode(altCode);
    }
    
    /**
     * Adds the category.
     *
     * @param category the category
     * @return the response entity
     */
    @PostMapping(value = "/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody CategoryRequest category) {
    	Category categoryToBeAdded = converter.convertCategoryRequestToCategory(category);
    	categoryService.addCategory(categoryToBeAdded);
    	return categoryToBeAdded;
    }
    
    /**
     * Update.
     *
     * @param id the id
     * @param category the category
     */
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") int id, @RequestBody CategoryRequest category) {
    	Category categoryToBeUpdated = converter.convertCategoryRequestToCategory(category);
    	categoryToBeUpdated.setIdCategory(id);
    	categoryService.updateCategory(categoryToBeUpdated);
    }
    
    /**
     * Delete.
     *
     * @param id the id
     */
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {
    	categoryService.removeCategory(id);
    }
    
}

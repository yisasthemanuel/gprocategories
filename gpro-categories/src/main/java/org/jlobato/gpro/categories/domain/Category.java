package org.jlobato.gpro.categories.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Category implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4340826029304537073L;
	
	/** The id category. */
	private int idCategory;
	
	/** The code category. */
	private String codeCategory;
	
	/** The description category. */
	private String descriptionCategory;
	
	/** The lvl category. */
	private int lvlCategory;
	
	/** The code alt category. */
	private String codeAltCategory;

	/**
	 * Instantiates a new category.
	 */
	public Category() {
		super();
	}
}
